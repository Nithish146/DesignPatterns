import java.util.Random;

public class ReportGenerator {
    public void generate(String studentName) {
        System.out.println(" Generating performance report for: " + studentName);
        System.out.println("Score: " + new Random().nextInt(100) + "/100");
        System.out.println(" Strengths: Mathematics, Science");
        System.out.println("Improvement Needed: Reading Comprehension");
    }
}
