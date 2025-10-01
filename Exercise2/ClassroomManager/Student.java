import java.util.*;

public class Student {
    private String id;
    private Map<String, Set<Assignment>> submittedAssignments;

    public Student(String id) {
        this.id = id.trim();
        this.submittedAssignments = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public boolean submitAssignment(String className, Assignment assignment) {
        String key = className.toLowerCase();
        submittedAssignments.putIfAbsent(key, new HashSet<>());
        Set<Assignment> submissions = submittedAssignments.get(key);
        if (submissions.contains(assignment)) {
            return false; // Already submitted
        }
        submissions.add(assignment);
        return true;
    }

    public boolean hasSubmitted(String className, Assignment assignment) {
        String key = className.toLowerCase();
        Set<Assignment> submissions = submittedAssignments.get(key);
        return submissions != null && submissions.contains(assignment);
    }
}
