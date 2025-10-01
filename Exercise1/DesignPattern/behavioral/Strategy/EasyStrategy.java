// Concrete Strategy: Easy
public class EasyStrategy implements QuestionStrategy {
    @Override
    public void getNextQuestion() {
        System.out.println("Fetching an EASY question for the student...");
    }
}
