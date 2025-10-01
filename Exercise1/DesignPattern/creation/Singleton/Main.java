public class Main {
    public static void main(String[] args) {
        System.out.println("--- Singleton Pattern Demo: Edu Initiative ---");

        AssessmentManager manager = AssessmentManager.getInstance();

        manager.startAssessment("Alice");
        manager.generateReport("Alice");
        manager.assignBadge("Alice", "Math Whiz");
        manager.notifyProgress("Alice", "completed");

        // Verify Singleton
        AssessmentManager manager2 = AssessmentManager.getInstance();
        System.out.println("Are both instances same? " + (manager == manager2)); // true
    }
}
