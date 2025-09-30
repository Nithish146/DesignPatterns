

public class TrueFalseFactory extends QuestionFactory {
    @Override
    public Question createQuestion() {
        return new TrueFalseQuestion();
    }
}
