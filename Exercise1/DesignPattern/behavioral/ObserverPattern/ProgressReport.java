// ProgressReport.java
import java.util.ArrayList;
import java.util.List;

public class ProgressReport {
    private List<Observer> observers = new ArrayList<>();
    private String studentName;
    private String report;

    // Add observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(studentName, report);
        }
    }

    // Generate report
    public void generateReport(String studentName, String report) {
        this.studentName = studentName;
        this.report = report;
        System.out.println("Progress Report generated for " + studentName);
        notifyObservers();
    }
}
