// Main.java
public class Main {
    public static void main(String[] args) {
        // Create subject
        ProgressReport report = new ProgressReport();

        // Create observers
        Observer teacher = new Teacher();
        Observer parent = new Parent();
        Observer admin = new Admin();

        // Register observers
        report.addObserver(teacher);
        report.addObserver(parent);
        report.addObserver(admin);

        // Generate a progress report
        report.generateReport("John Doe", "Math: A, Science: B+, English: A-");
    }
}
