package studentdriver;

public class GraduateStudent extends StudentFees {

    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    private double n;

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
    }

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.isGraduateAssistant = isGraduateAssistant;
    }

    public boolean isGraduateAssistant() {
        return isGraduateAssistant;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public double getPayableAmount() {
//    //double tuitionFee = calculateTuitionFee();
//    double totalFee = tuitionFee + ADDITIONAL_FEES;
//        if (isGraduateAssistant) {
//            if ("full".equalsIgnoreCase(graduateAssistantType)) {
//                totalFee -= tuitionFee;
//            } else if ("half".equalsIgnoreCase(graduateAssistantType)) {
//                totalFee -= tuitionFee / 2;
        if (isGraduateAssistant) {
            if (graduateAssistantType.equalsIgnoreCase("true")) {
                double n = 0;
            } else if (graduateAssistantType.equalsIgnoreCase("false")) {
                double n = 0.5;
            } else {
                double n = 1.0;
            }
        }
        return n * (coursesEnrolled * getCREDIT_PER_COURSE() * getPER_CREDIT_FEE() + ADDITIONAL_FEES);
    }

    public String toString() {
        return ("Student name" + super.getStudentName() + "\nStudent id: " + super.getStudentID() + "\nEnrolled: " + this.isEnrolled() + "\nGraduate assistant: " + this.isGraduateAssistant() + "Graduate assistant type: " + this.graduateAssistantType + "\nCourses enrolled: " + coursesEnrolled + "\nPayable Amount: " + this.getPayableAmount());
    }
}
