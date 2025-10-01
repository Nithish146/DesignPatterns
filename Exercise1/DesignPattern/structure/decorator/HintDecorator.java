public class HintDecorator extends QuestionDecorator {

    private String hint;

    public HintDecorator(Question decoratedQuestion, String hint) {
        super(decoratedQuestion);
        this.hint = hint;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hint: " + hint);
    }
}
