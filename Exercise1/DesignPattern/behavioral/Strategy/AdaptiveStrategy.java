// Adaptive Strategy: Chooses Easy/Medium/Hard dynamically
public class AdaptiveStrategy implements QuestionStrategy {

    private int lastScore; // Assume last quiz score (0–100)

    public AdaptiveStrategy(int lastScore) {
        this.lastScore = lastScore;
    }

    @Override
    public void getNextQuestion() {
        if (lastScore < 40) {
            new EasyStrategy().getNextQuestion();
        } else if (lastScore < 70) {
            new MediumStrategy().getNextQuestion();
        } else {
            new HardStrategy().getNextQuestion();
        }
    }
}
