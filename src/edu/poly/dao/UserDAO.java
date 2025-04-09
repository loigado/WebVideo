package edu.poly.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import edu.poly.common.JpaUtils;
import edu.poly.model.User;

public class UserDAO extends AbstractEntityDAO<User> {
	public UserDAO() {
		super(User.class);
	}

	public void changePassword(String username, String oldPassword, String newPassword) throws Exception {
		EntityManager em = JpaUtils.getEntityManager();
		EntityTransaction trans = em.getTransaction();

		String jpql = "select u from User u where u.username = :username";
		try {
			trans.begin();
			TypedQuery<User> query = em.createQuery(jpql, User.class);
			query.setParameter("username", username);

			User user = query.getSingleResult();
			if (user == null) {
				throw new Exception("Username not found!");
			}

			if (!user.getPassword().equals(oldPassword)) {
				throw new Exception("Current password is incorrect!");
			}

			user.setPassword(newPassword);
			em.merge(user);
			trans.commit();
		} catch (NoResultException e) {
			throw new Exception("Username not found!", e);
		} catch (Exception e) {
			trans.rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	public User findByUserEmail(String username, String email) {
		EntityManager em = JpaUtils.getEntityManager();
		String jpql = "select u from User u where u.id = :username and u.email = :email";
		try {
			TypedQuery<User> query = em.createQuery(jpql, User.class);
			query.setParameter("username", username);
			query.setParameter("email", email);

			return query.getSingleResult();
		} finally {
			em.close();
		}
	}
}
