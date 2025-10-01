// Parent.java
public class Parent implements Observer {
    @Override
    public void update(String studentName, String report) {
        System.out.println("Parent notified: " + studentName + "'s report: " + report);
    }
}
