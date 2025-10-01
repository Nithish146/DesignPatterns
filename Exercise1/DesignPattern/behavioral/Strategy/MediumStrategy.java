// Concrete Strategy: Medium
public class MediumStrategy implements QuestionStrategy {
    @Override
    public void getNextQuestion() {
        System.out.println("Fetching a MEDIUM question for the student...");
    }
}
