

public class Main {
    public static void main(String[] args) {
        Question baseQuestion = new BaseQuestion("What is the capital of France?");
        
        // Decorate with hint
        Question hintQuestion = new HintDecorator(baseQuestion, "It's also called the city of love.");
        
        // Decorate with time limit
        Question timedQuestion = new TimeLimitDecorator(hintQuestion, 30);
        
        // Decorate with gamification
        Question gamifiedQuestion = new GamificationDecorator(timedQuestion, 50, "Geography Whiz");

        System.out.println("--- Decorated Question ---");
        gamifiedQuestion.display();
    }
    
}
