## Kết Quả Đánh Giá Bằng JaCoCo

### Tổng Quan
Báo cáo kiểm thử tự động được thực hiện bằng JaCoCo để đánh giá mức độ bao phủ mã nguồn. Dưới đây là các số liệu chính:

| Thành phần              | Bao phủ lệnh (%) | Bao phủ nhánh (%) | Số lệnh chưa bao phủ | Số nhánh chưa bao phủ |
|-------------------------|------------------|-------------------|----------------------|-----------------------|
| **LinkedList.java**     | 92%              | 87%               | 8                    | 1                     |
| **SortAlgorithms.java** | 97%              | 100%              | 10                   | 0                     |
| **SearchAlgorithms.java** | 95%            | 100%              | 8                    | 0                     |
| **Tổng cộng**           | **96%**          | **93%**           | **26**               | **1**                 |

---

### Phân Tích Chi Tiết

1. **LinkedList.java**:
   - **Mức độ bao phủ lệnh**: 92%
   - **Mức độ bao phủ nhánh**: 87%
   - **Lệnh chưa bao phủ**: 8
   - **Nhánh chưa bao phủ**: 1
   - **Nhận xét**: Một số lệnh và nhánh trong các trường hợp đặc biệt (danh sách rỗng, hoặc phần tử không tồn tại) chưa được kiểm thử đầy đủ.

2. **SortAlgorithms.java**:
   - **Mức độ bao phủ lệnh**: 97%
   - **Mức độ bao phủ nhánh**: 100%
   - **Lệnh chưa bao phủ**: 10
   - **Nhánh chưa bao phủ**: 0
   - **Nhận xét**: Gần như tất cả các lệnh và nhánh đã được kiểm thử. Cần xem xét kỹ các điều kiện phức tạp hơn nếu có.

3. **SearchAlgorithms.java**:
   - **Mức độ bao phủ lệnh**: 95%
   - **Mức độ bao phủ nhánh**: 100%
   - **Lệnh chưa bao phủ**: 8
   - **Nhánh chưa bao phủ**: 0
   - **Nhận xét**: Các thuật toán tìm kiếm được kiểm thử khá đầy đủ. Cần thêm kiểm thử với các bộ dữ liệu lớn hoặc trường hợp lỗi.

---

### Kết Luận

- Mức độ bao phủ mã nguồn tổng quan đạt **96% cho lệnh** và **93% cho nhánh**.
- Một số trường hợp ngoại lệ và lệnh chưa được kiểm thử, tập trung chủ yếu ở lớp `LinkedList.java`.
- Các thuật toán tìm kiếm và sắp xếp đã đạt mức độ bao phủ rất tốt.


- Bổ sung thêm các trường hợp kiểm thử với điều kiện đặc biệt hoặc lỗi cho lớp `LinkedList.java`.
- Đánh giá và cải tiến các bài kiểm thử để đạt được mức độ bao phủ tối đa (100%).
- Đảm bảo kiểm thử các bộ dữ liệu lớn hoặc trường hợp phức tạp hơn cho tất cả các thuật toán.
