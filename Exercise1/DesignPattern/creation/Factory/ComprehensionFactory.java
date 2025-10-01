

public class ComprehensionFactory extends QuestionFactory {
    @Override
    public Question createQuestion() {
        return new ComprehensionQuestion();
    }
}
