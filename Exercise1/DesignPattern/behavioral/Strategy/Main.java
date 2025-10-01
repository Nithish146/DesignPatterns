// Client code
public class Main {
    public static void main(String[] args) {
        StudentContext student = new StudentContext();

        // Case 1: Student weak (score 25)
        student.setStrategy(new AdaptiveStrategy(25));
        student.askQuestion();

        // Case 2: Student average (score 55)
        student.setStrategy(new AdaptiveStrategy(55));
        student.askQuestion();

        // Case 3: Student strong (score 85)
        student.setStrategy(new AdaptiveStrategy(85));
        student.askQuestion();
    }
}
