

public class MCQFactory extends QuestionFactory {
    @Override
    public Question createQuestion() {
        return new MCQQuestion();
    }
}
