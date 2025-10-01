// Admin.java
public class Admin implements Observer {
    @Override
    public void update(String studentName, String report) {
        System.out.println("Admin notified: " + studentName + "'s report: " + report);
    }
}

