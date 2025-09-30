

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ei ASSET Test Engine ---");

        // Generate different types of questions
        QuestionFactory mcqFactory = new MCQFactory();
        Question mcq = mcqFactory.createQuestion();
        mcq.display();

        QuestionFactory tfFactory = new TrueFalseFactory();
        Question tf = tfFactory.createQuestion();
        tf.display();

        QuestionFactory compFactory = new ComprehensionFactory();
        Question comp = compFactory.createQuestion();
        comp.display();
    }
}
