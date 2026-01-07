import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // --- PHẦN 1: TEST CHO HÀM countExcellentStudents ---

    @Test
    public void testCountExcellentStudents_NormalCase() {
        // Danh sách có:
        // 9.0, 8.5 (Giỏi) -> Đếm 2
        // 7.0 (Khá) -> Không đếm
        // 11.0, -1.0 (Sai) -> Bỏ qua
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores), "Phải đếm được 2 học sinh giỏi (9.0 và 8.5)");
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        // Danh sách rỗng
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()), "Danh sách rỗng phải trả về 0");
    }

    @Test
    public void testCountExcellentStudents_Boundary() {
        // Kiểm tra điểm biên: 8.0 (vừa đủ giỏi), 10.0 (tối đa), 7.99 (suýt giỏi)
        List<Double> scores = Arrays.asList(8.0, 10.0, 7.99);
        assertEquals(2, analyzer.countExcellentStudents(scores), "Điểm 8.0 và 10.0 là giỏi, 7.99 thì không");
    }

    @Test
    public void testCountExcellentStudents_AllInvalid() {
        // Toàn bộ điểm sai
        List<Double> scores = Arrays.asList(-5.0, 10.1, 100.0);
        assertEquals(0, analyzer.countExcellentStudents(scores), "Không có điểm hợp lệ nào thì trả về 0");
    }

    // --- PHẦN 2: TEST CHO HÀM calculateValidAverage ---

    @Test
    public void testCalculateValidAverage_NormalCase() {
        // Điểm hợp lệ: 9.0, 8.0, 7.0 -> Tổng 24 -> Trung bình 8.0
        // Điểm sai: -1.0, 20.0 -> Bỏ qua
        List<Double> scores = Arrays.asList(9.0, 8.0, 7.0, -1.0, 20.0);
        assertEquals(8.0, analyzer.calculateValidAverage(scores), 0.001, "Phải tính trung bình đúng các điểm hợp lệ");
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        // Danh sách rỗng
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001, "Danh sách rỗng trả về 0.0");
    }

    @Test
    public void testCalculateValidAverage_OnlyInvalidScores() {
        // Danh sách chỉ chứa toàn điểm sai -> Coi như rỗng
        List<Double> scores = Arrays.asList(-10.0, 15.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.001, "Chỉ có điểm sai thì trung bình là 0.0");
    }
}