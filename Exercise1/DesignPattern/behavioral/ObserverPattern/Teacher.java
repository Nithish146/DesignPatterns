// Teacher.java
public class Teacher implements Observer {
    @Override
    public void update(String studentName, String report) {
        System.out.println("Teacher notified: " + studentName + "'s report: " + report);
    }
}
