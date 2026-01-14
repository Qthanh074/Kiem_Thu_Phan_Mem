## BÀI THỰC HÀNH KIỂM THỬ PHẦN MỀM

### Thông tin sinh viên

* **Họ và tên:** Đào Quang Thành
* **MSSV:** BIT230384
* **Email:** daoquangthanh0704@gmail.com
* **Môn học:** Kiểm thử phần mềm
* **Giảng viên:** Trương Anh Hoàng

---

## PHẦN 1 – BÀI THỰC HÀNH TUẦN 1: TRẢI NGHIỆM KIỂM THỬ GIAO DIỆN

### Mục tiêu bài thực hành

* Làm quen với GitHub và cách quản lý bài thực hành bằng kho lưu trữ (repository).
* Trải nghiệm và đánh giá chất lượng giao diện phần mềm.
* Nhận thức được vai trò của trải nghiệm người dùng (UX/UI) trong kiểm thử phần mềm.

### Nội dung thực hành

#### Trải nghiệm kiểm thử giao diện với CantUnsee

* Truy cập trang web: [https://cantunsee.space/](https://cantunsee.space/)
* Thực hiện các bài kiểm tra về:

  * Khả năng phân biệt màu sắc.
  * Khả năng nhận diện và đọc hiểu các thành phần giao diện người dùng.

### Minh chứng kết quả

* Ảnh chụp màn hình kết quả làm bài trên CantUnsee.
* Ảnh có dấu hiệu cá nhân (ví dụ: đang đăng nhập Chrome) để chứng minh tính xác thực.

**Hình ảnh minh chứng:**
![Kết quả kiểm tra UI trên cantunsee.space](Báo%20cáo%20cantunsee.jpg)


## PHẦN 2 – BÀI THỰC HÀNH TUẦN 2: KIỂM THỬ UNIT TEST VỚI JUNIT

### Tên bài tập

**Phân tích điểm số học sinh (Student Analyzer)**

### Mô tả bài tập

Dự án này là bài tập thực hành về Kiểm thử phần mềm (Software Testing), tập trung vào việc viết **Unit Test** cho mã nguồn Java bằng thư viện **JUnit**.

Chương trình cung cấp lớp `StudentAnalyzer` để xử lý danh sách điểm số của học sinh với các chức năng chính:

#### 1. Đếm số học sinh giỏi

* **Input:** Danh sách điểm số (List)
* **Logic:** Đếm các điểm >= 8.0. Bỏ qua các điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10)
* **Output:** Số lượng học sinh giỏi

#### 2. Tính điểm trung bình hợp lệ

* **Input:** Danh sách điểm số (List)
* **Logic:** Tính trung bình cộng các điểm nằm trong khoảng [0, 10]. Bỏ qua các điểm sai
* **Output:** Điểm trung bình (trả về 0 nếu danh sách rỗng hoặc không có điểm hợp lệ)


### Cấu trúc thư mục dự án

```
unit-test/
├── src/
│   └── StudentAnalyzer.java      # Mã nguồn chính (Source code)
├── test/
│   └── StudentAnalyzerTest.java  # Mã nguồn kiểm thử (Unit Tests)
├── README.md                     # Tài liệu hướng dẫn
```
