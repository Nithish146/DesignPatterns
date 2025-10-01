// Concrete Strategy: Hard
public class HardStrategy implements QuestionStrategy {
    @Override
    public void getNextQuestion() {
        System.out.println("Fetching a HARD question for the student...");
    }
}
