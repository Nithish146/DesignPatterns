

public class BaseQuestion implements Question {

    private String questionText;

    public BaseQuestion(String questionText) {
        this.questionText = questionText;
    }

    @Override
    public void display() {
        System.out.println("Question: " + questionText);
    }
}
