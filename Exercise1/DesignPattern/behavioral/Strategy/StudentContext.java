// Context class
public class StudentContext {
    private QuestionStrategy strategy;

    public void setStrategy(QuestionStrategy strategy) {
        this.strategy = strategy;
    }

    public void askQuestion() {
        if (strategy == null) {
            System.out.println("No strategy set. Please select a difficulty.");
        } else {
            strategy.getNextQuestion();
        }
    }
}
