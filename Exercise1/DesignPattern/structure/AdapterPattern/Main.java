public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 40);
        Student student2 = new Student("Bob", 65);
        Student student3 = new Student("Charlie", 90);

        student1.assignProblem();
        student2.assignProblem();
        student3.assignProblem();

        System.out.println("\nAfter improving Alice's score:");
        student1.setPerformanceScore(85);
        student1.assignProblem();
    }
}
