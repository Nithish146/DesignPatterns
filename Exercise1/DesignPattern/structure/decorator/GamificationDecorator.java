public class GamificationDecorator extends QuestionDecorator {

    private int points;
    private String badge;

    public GamificationDecorator(Question decoratedQuestion, int points, String badge) {
        super(decoratedQuestion);
        this.points = points;
        this.badge = badge;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Points: " + points + ", Badge: " + badge);
    }
}