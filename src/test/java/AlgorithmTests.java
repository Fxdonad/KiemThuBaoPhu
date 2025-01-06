import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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
