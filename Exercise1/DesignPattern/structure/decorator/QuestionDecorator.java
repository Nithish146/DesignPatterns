public abstract class QuestionDecorator implements Question {

    protected Question decoratedQuestion;

    public QuestionDecorator(Question decoratedQuestion) {
        this.decoratedQuestion = decoratedQuestion;
    }

    @Override
    public void display() {
        decoratedQuestion.display();
    }
}