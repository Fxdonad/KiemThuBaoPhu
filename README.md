## Kết Quả Đánh Giá Bằng JaCoCo

![image](https://github.com/user-attachments/assets/2294e263-a1d4-41a6-93a4-38d21fc42062)

## Code Test
    public class AlgorithmTests {
    
        // Kiểm thử thuật toán tìm kiếm tuyến tính
        @Test
        public void testLinearSearch() {
            int[] arr = {1, 3, 5, 7, 9};
            assertEquals(2, SearchAlgorithms.linearSearch(arr, 5));
            assertEquals(-1, SearchAlgorithms.linearSearch(arr, 4));
        }
    
        // Kiểm thử thuật toán tìm kiếm nhị phân
        @Test
        public void testBinarySearch() {
            int[] arr = {1, 3, 5, 7, 9};
            assertEquals(2, SearchAlgorithms.binarySearch(arr, 5));
            assertEquals(-1, SearchAlgorithms.binarySearch(arr, 4));
        }
    
        // Kiểm thử thuật toán sắp xếp nổi bọt
        @Test
        public void testBubbleSort() {
            int[] arr = {5, 2, 9, 1, 5, 6};
            SortAlgorithms.bubbleSort(arr);
            assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, arr);
        }
    
        // Kiểm thử thuật toán sắp xếp nhanh
        @Test
        public void testQuickSort() {
            int[] arr = {5, 2, 9, 1, 5, 6};
            SortAlgorithms.quickSort(arr, 0, arr.length - 1);
            assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, arr);
        }
    
        // Kiểm thử danh sách liên kết đơn
        @Test
        public void testLinkedList() {
            LinkedList list = new LinkedList();
            list.add(10);
            list.add(20);
            assertTrue(list.contains(10));
            assertFalse(list.contains(30));
        }
    
        // Kiểm thử với các trường hợp biên
        @Test
        public void testEdgeCases() {
            int[] arr = {};
            assertEquals(-1, SearchAlgorithms.linearSearch(arr, 1));
            assertEquals(-1, SearchAlgorithms.binarySearch(arr, 1));
    
            LinkedList emptyList = new LinkedList();
            assertFalse(emptyList.contains(1));
        }
    }


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

## Đoạn ChatGPT
(do chứa hình ảnh nên GPT không hỗ trợ share)

https://github.com/user-attachments/assets/a2a35fd6-fb92-4654-bb3f-0b3bf1a2c701

## Phần Cần Cải Thiện

### 1. Bổ sung kiểm thử cho các trường hợp đặc biệt
- **`LinkedList.java`**: 
  - Hiện tại, mức độ bao phủ lệnh đạt 92% và bao phủ nhánh đạt 87%. Đã thêm kiểm thử một số trường hợp đặc biệt:
    - Danh sách rỗng.
    - Phần tử không tồn tại trong danh sách.
    - Các thao tác biên như thêm hoặc xóa phần tử đầu/cuối danh sách.

### 2. Kiểm tra các điều kiện phức tạp
- **`SortAlgorithms.java`** và **`SearchAlgorithms.java`**:
  - Mặc dù bao phủ nhánh đạt 100%, nhưng cần kiểm tra kỹ các điều kiện phức tạp hơn để đảm bảo tính toàn diện, chẳng hạn như:
    - Đầu vào lớn bất thường.
    - Dữ liệu đầu vào không hợp lệ hoặc có giá trị biên.
  - Đề xuất: Bổ sung các kiểm thử liên quan đến các trường hợp này để phát hiện lỗi tiềm ẩn.

### 3. Sử dụng công cụ kiểm tra bao phủ mã
- Sử dụng các công cụ kiểm tra bao phủ mã như `JaCoCo` để phát hiện các tệp mã chưa được kiểm thử hoặc chưa đạt mức bao phủ mong muốn.
- Đảm bảo tất cả các tệp mã nguồn đều được kiểm tra đầy đủ, không có tệp thừa hoặc không cần thiết.

### 4. Liên tục cải tiến
- Kiểm thử là một quá trình liên tục, cần thường xuyên cập nhật và mở rộng các trường hợp kiểm thử khi mã nguồn thay đổi.
- Đảm bảo rằng mỗi thay đổi trong mã nguồn đều đi kèm với các kiểm thử tương ứng.


