# 🎬 WebVideo - Nền Tảng Chia Sẻ Video Giải Trí

![Java](https://img.shields.io/badge/Java-8-orange?style=for-the-badge&logo=java)
![Servlet/JSP](https://img.shields.io/badge/Servlet%2FJSP-4.0-blue?style=for-the-badge&logo=java)
![Hibernate](https://img.shields.io/badge/Hibernate-5.6-yellowgreen?style=for-the-badge&logo=hibernate)
![SQL Server](https://img.shields.io/badge/SQL%20Server-2022-red?style=for-the-badge&logo=microsoftsqlserver)

**WebVideo** là một ứng dụng web giải trí cho phép người dùng xem, yêu thích và chia sẻ các video hấp dẫn. Dự án được xây dựng dựa trên công nghệ Java truyền thống (Servlet/JSP) kết hợp với Hibernate để quản lý dữ liệu, mang lại trải nghiệm ổn định và hiệu quả.

---

## 🚀 Tính Năng Chính

### 📺 Dành cho Người Dùng (Site)
- **Xem Video:** Trang chủ hiển thị danh sách video phong phú với hình ảnh đại diện sinh động.
- **Yêu Thích (Favorite):** Người dùng có thể đánh dấu lưu lại những video mình yêu thích nhất.
- **Chia Sẻ (Share):** Tính năng gửi link video trực tiếp cho bạn bè thông qua Email (tích hợp SMTP).
- **Quản Lý Tài Khoản:**
  - Đăng ký, đăng nhập và đăng xuất.
  - Cập nhật thông tin cá nhân.
  - Thay đổi mật khẩu.
  - Khôi phục mật khẩu qua Email khi bị quên.

### 🛠️ Dành cho Quản Trị Viên (Admin)
- **Quản Lý Video (Video Management):** Thêm, sửa, xóa và tìm kiếm danh sách video một cách trực quan.
- **Quản Lý Người Dùng (User Management):** Quản lý thông tin và phân quyền người dùng trong hệ thống.
- **Báo Cáo & Thống Kê (Reporting):**
  - Thống kê số lượng lượt yêu thích cho từng video.
  - Danh sách người dùng yêu thích video.
  - Thống kê lượt chia sẻ video qua Email.

---

## 🛠️ Công Nghệ Sử Dụng

| Thành phần | Công nghệ |
| :--- | :--- |
| **Ngôn ngữ** | Java 8 |
| **Web Framework** | Servlet API, JSP (Java Server Pages) |
| **ORM Framework** | Hibernate 5.6 (JPA) |
| **Database** | Microsoft SQL Server |
| **Frontend UI** | HTML5, CSS3, Bootstrap, JSTL |
| **Dịch vụ Email** | Jakarta Mail |
| **Quản lý dự án** | Maven |

---

## 🏗️ Kiến Trúc Hệ Thống

Dự án được tổ chức theo mô hình phân lớp rõ ràng:
- **Presentation Layer:** Sử dụng JSP và JSTL để hiển thị giao diện người dùng.
- **Controller Layer (Servlets):** Điều phối các yêu cầu từ phía người dùng và gọi các dịch vụ xử lý.
- **DAO Layer (Data Access Object):** Sử dụng Hibernate để thực hiện các thao tác CRUD với SQL Server.
- **Utilities:** Các bộ lọc (Filter) xử lý phân quyền và mã hóa tiếng Việt, các lớp hỗ trợ gửi Email.

---

## ⚙️ Hướng Dẫn Cài Đặt

### 📋 Yêu cầu hệ thống
- JDK 8 trở lên.
- Apache Tomcat 9.0.
- Microsoft SQL Server.
- Maven.

### 🏃 Các bước thực hiện
1. **Clone dự án:**
   ```bash
   git clone https://github.com/your-username/WebVideo.git
   ```
2. **Cấu hình Cơ sở dữ liệu:**
   - Tạo một database mới trong SQL Server với tên: `PolyOEAsm`.
   - Chạy các câu lệnh trong file `PolyOEASM.sql` để tạo bảng và dữ liệu mẫu.
   - Cập nhật thông tin kết nối (URL, username, password) trong file `src/META-INF/persistence.xml`.
     - *Lưu ý:* Mặc định đang để user `sa` và mật khẩu `123456`. Hãy đổi lại cho khớp với máy của bạn.
3. **Cấu hình Server:**
   - Mở dự án bằng Eclipse hoặc IntelliJ.
   - Add Apache Tomcat 9 vào Server runtime.
4. **Deploy & Chạy:**
   - Build dự án bằng Maven: `mvn clean install`.
   - Run trên Server Tomcat.
   - Truy cập: `http://localhost:8080/WebVideo`

---

## 📸 Hình Ảnh Demo
*(Cập nhật các link ảnh dưới đây bằng ảnh thực tế từ dự án của bạn)*

| Trang Chủ | Chi Tiết Video | Quản Lý Admin |
| :---: | :---: | :---: |
| ![Home](https://via.placeholder.com/300x180?text=Home+Page) | ![Watch](https://via.placeholder.com/300x180?text=Watch+Video) | ![Admin](https://via.placeholder.com/300x180?text=Admin+Dashboard) |

---

## 🤝 Liên Hệ
- **Tác giả:** [Tên của bạn]
- **Email:** [Email của bạn]

---
*Dự án này là sản phẩm bài tập lớn (ASM) môn Java 4/5, thể hiện khả năng làm việc với Servlet/JSP và Hibernate một cách chuyên nghiệp.*
