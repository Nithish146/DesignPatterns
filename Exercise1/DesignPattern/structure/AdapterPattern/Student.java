public class Student {
    private String name;
    private int performanceScore; // 0-100
    private LearningStrategy strategy;

    public Student(String name, int performanceScore) {
        this.name = name;
        this.performanceScore = performanceScore;
        updateStrategy();
    }

    public void updateStrategy() {
        if (performanceScore < 50) {
            strategy = new EasyStrategy();
        } else if (performanceScore < 80) {
            strategy = new MediumStrategy();
        } else {
            strategy = new HardStrategy();
        }
    }

    public void assignProblem() {
        System.out.print(name + ": ");
        strategy.assignProblem();
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
        updateStrategy();
    }
}
