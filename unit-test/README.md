# Bài tập: Phân tích điểm số học sinh (Student Analyzer)

Dự án này là bài tập thực hành về Kiểm thử phần mềm (Software Testing), tập trung vào việc viết Unit Test cho mã nguồn Java sử dụng thư viện **JUnit**.

## Mô tả bài toán

Chương trình cung cấp lớp `StudentAnalyzer` để xử lý danh sách điểm số của học sinh với các chức năng chính:

1.  **Đếm số học sinh Giỏi:**
    * Input: Danh sách điểm số (List<Double>).
    * Logic: Đếm các điểm `>= 8.0`. Bỏ qua các điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10).
    * Output: Số lượng học sinh giỏi.
2.  **Tính điểm trung bình hợp lệ:**
    * Input: Danh sách điểm số (List<Double>).
    * Logic: Tính trung bình cộng các điểm nằm trong khoảng `[0, 10]`. Bỏ qua các điểm sai.
    * Output: Điểm trung bình (trả về 0 nếu danh sách rỗng hoặc không có điểm hợp lệ).

## Công nghệ sử dụng

* **Ngôn ngữ:** Java (JDK 17+)
* **Công cụ kiểm thử:** JUnit 5 (Jupiter)
* **IDE:** IntelliJ IDEA / VS Code

## Cấu trúc thư mục

```text
unit-test/
├── src/
│   └── StudentAnalyzer.java      # Mã nguồn chính (Source code)
├── test/
│   └── StudentAnalyzerTest.java  # Mã nguồn kiểm thử (Unit Tests)
├── README.md                     # Tài liệu hướng dẫn