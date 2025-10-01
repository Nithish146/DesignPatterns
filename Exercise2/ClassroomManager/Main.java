import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VirtualClassroomManager manager = VirtualClassroomManager.getInstance();

        System.out.println("Welcome to Virtual Classroom Manager");
        System.out.println("Commands: add_classroom, remove_classroom, add_student, remove_student, schedule_assignment, remove_assignment, submit_assignment, list_classrooms, list_students, exit");

        while (true) {
            System.out.print("> ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) continue;

            String[] tokens = input.split(" ", 3);
            String command = tokens[0].toLowerCase();

            try {
                switch (command) {
                    case "add_classroom":
                        if (tokens.length < 2) throw new IllegalArgumentException("Usage: add_classroom <class_name>");
                        manager.addClassroom(tokens[1].trim());
                        break;

                    case "remove_classroom":
                        if (tokens.length < 2) throw new IllegalArgumentException("Usage: remove_classroom <class_name>");
                        manager.removeClassroom(tokens[1].trim());
                        break;

                    case "add_student":
                        if (tokens.length < 3) throw new IllegalArgumentException("Usage: add_student <student_id> <class_name>");
                        manager.addStudent(tokens[1].trim(), tokens[2].trim());
                        break;

                    case "remove_student":
                        if (tokens.length < 3) throw new IllegalArgumentException("Usage: remove_student <student_id> <class_name>");
                        manager.removeStudent(tokens[1].trim(), tokens[2].trim());
                        break;

                    case "schedule_assignment":
                        if (tokens.length < 3) throw new IllegalArgumentException("Usage: schedule_assignment <class_name> <assignment_details>");
                        manager.scheduleAssignment(tokens[1].trim(), tokens[2].trim());
                        break;

                    case "remove_assignment":
                        if (tokens.length < 3) throw new IllegalArgumentException("Usage: remove_assignment <class_name> <assignment_details>");
                        manager.removeAssignment(tokens[1].trim(), tokens[2].trim());
                        break;

                    case "submit_assignment":
                        String[] parts = input.split(" ", 4);
                        if (parts.length < 4) throw new IllegalArgumentException("Usage: submit_assignment <student_id> <class_name> <assignment_details>");
                        manager.submitAssignment(parts[1].trim(), parts[2].trim(), parts[3].trim());
                        break;

                    case "list_classrooms":
                        manager.listClassrooms();
                        break;

                    case "list_students":
                        if (tokens.length < 2) throw new IllegalArgumentException("Usage: list_students <class_name>");
                        manager.listStudents(tokens[1].trim());
                        break;

                    case "exit":
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Unknown command. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
