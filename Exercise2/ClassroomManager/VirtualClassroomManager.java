import java.util.*;

public class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;
    private static VirtualClassroomManager instance = null;

    private VirtualClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static VirtualClassroomManager getInstance() {
        if (instance == null) {
            instance = new VirtualClassroomManager();
        }
        return instance;
    }

    // Add Classroom
    public void addClassroom(String name) {
        String key = name.toLowerCase();
        if (classrooms.containsKey(key)) {
            System.out.println("Classroom " + name + " already exists.");
            return;
        }
        classrooms.put(key, new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    // Remove Classroom
    public void removeClassroom(String name) {
        if (classrooms.remove(name.toLowerCase()) != null) {
            System.out.println("Classroom " + name + " has been removed.");
        } else {
            System.out.println("Classroom " + name + " does not exist.");
        }
    }

    // Add Student
    public void addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className.toLowerCase());
        if (classroom == null) {
            System.out.println("Classroom " + className + " does not exist.");
            return;
        }
        Student student = new Student(studentId);
        if (!classroom.addStudent(student)) {
            System.out.println("Student " + studentId + " already enrolled in " + className + ".");
            return;
        }
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    // Remove Student
    public void removeStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className.toLowerCase());
        if (classroom == null) {
            System.out.println("Classroom " + className + " does not exist.");
            return;
        }
        if (classroom.removeStudent(studentId)) {
            System.out.println("Student " + studentId + " removed from " + className + ".");
        } else {
            System.out.println("Student " + studentId + " not found in " + className + ".");
        }
    }

    // Schedule Assignment
    public void scheduleAssignment(String className, String details) {
        Classroom classroom = classrooms.get(className.toLowerCase());
        if (classroom == null) {
            System.out.println("Classroom " + className + " does not exist.");
            return;
        }
        if (!classroom.scheduleAssignment(details)) {
            System.out.println("Assignment already scheduled for " + className + ".");
            return;
        }
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    // Remove Assignment
    public void removeAssignment(String className, String details) {
        Classroom classroom = classrooms.get(className.toLowerCase());
        if (classroom == null) {
            System.out.println("Classroom " + className + " does not exist.");
            return;
        }
        if (classroom.removeAssignment(details)) {
            System.out.println("Assignment removed from " + className + ".");
        } else {
            System.out.println("Assignment not found in " + className + ".");
        }
    }

    // Submit Assignment
    public void submitAssignment(String studentId, String className, String details) {
        Classroom classroom = classrooms.get(className.toLowerCase());
        if (classroom == null) {
            System.out.println("Classroom " + className + " does not exist.");
            return;
        }
        Student student = classroom.getStudent(studentId);
        if (student == null) {
            System.out.println("Student " + studentId + " is not enrolled in " + className + ".");
            return;
        }
        if (!classroom.assignmentExists(details)) {
            System.out.println("Assignment does not exist in " + className + ".");
            return;
        }
        Assignment assignment = new Assignment(details);
        if (!student.submitAssignment(className, assignment)) {
            System.out.println("Student " + studentId + " has already submitted this assignment in " + className + ".");
            return;
        }
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    // List Classrooms
    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        System.out.println("Classrooms:");
        classrooms.values().forEach(c -> System.out.println(c.getName()));
    }

    // List Students
    public void listStudents(String className) {
        Classroom classroom = classrooms.get(className.toLowerCase());
        if (classroom == null) {
            System.out.println("Classroom " + className + " does not exist.");
            return;
        }
        Collection<Student> students = classroom.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students enrolled in " + className + ".");
            return;
        }
        System.out.println("Students in " + className + ":");
        students.forEach(s -> System.out.println(s.getId()));
    }
}
