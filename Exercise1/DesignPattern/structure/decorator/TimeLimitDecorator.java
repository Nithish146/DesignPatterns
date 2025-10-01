public class TimeLimitDecorator extends QuestionDecorator {

    private int timeLimitInSeconds;

    public TimeLimitDecorator(Question decoratedQuestion, int timeLimitInSeconds) {
        super(decoratedQuestion);
        this.timeLimitInSeconds = timeLimitInSeconds;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Time Limit: " + timeLimitInSeconds + " seconds");
    }
}