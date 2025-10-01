public class AssessmentManager {

    private static AssessmentManager instance;

    // Feature modules
    private StartAssessment startAssessment;
    private ReportGenerator reportGenerator;
    private BadgeAssigner badgeAssigner;
    private ProgressNotifier progressNotifier;

    private AssessmentManager() {
        System.out.println(" AssessmentManager Initialized for Edu Initiative!");
        startAssessment = new StartAssessment();
        reportGenerator = new ReportGenerator();
        badgeAssigner = new BadgeAssigner();
        progressNotifier = new ProgressNotifier();
    }

    public static AssessmentManager getInstance() {
        if (instance == null) {
            instance = new AssessmentManager();
        }
        return instance;
    }

    // Delegation methods
    public void startAssessment(String studentName) {
        startAssessment.start(studentName);
    }

    public void generateReport(String studentName) {
        reportGenerator.generate(studentName);
    }

    public void assignBadge(String studentName, String badgeName) {
        badgeAssigner.assign(studentName, badgeName);
    }

    public void notifyProgress(String studentName, String status) {
        progressNotifier.notifyStatus(studentName, status);
    }
}
