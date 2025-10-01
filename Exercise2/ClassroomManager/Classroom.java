import java.util.*;

public class Classroom {
    private String name;
    private Map<String, Student> students;
    private Set<Assignment> assignments;

    public Classroom(String name) {
        this.name = name.trim();
        this.students = new HashMap<>();
        this.assignments = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public boolean addStudent(Student student) {
        String id = student.getId().toLowerCase();
        if (students.containsKey(id)) return false;
        students.put(id, student);
        return true;
    }

    public Student getStudent(String studentId) {
        return students.get(studentId.toLowerCase());
    }

    public boolean removeStudent(String studentId) {
        return students.remove(studentId.toLowerCase()) != null;
    }

    public boolean scheduleAssignment(String details) {
        return assignments.add(new Assignment(details));
    }

    public boolean removeAssignment(String details) {
        return assignments.remove(new Assignment(details));
    }

    public boolean assignmentExists(String details) {
        return assignments.contains(new Assignment(details));
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }
}
