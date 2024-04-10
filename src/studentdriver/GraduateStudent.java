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
            double tuition = coursesEnrolled * getCREDIT_PER_COURSE() * getPER_CREDIT_FEE();
        if (isGraduateAssistant) {
            if (graduateAssistantType.equalsIgnoreCase("full")) {
                tuition = 0;
            } else if (graduateAssistantType.equalsIgnoreCase("half")) {
                tuition = tuition / 2;
            
            }
        }
        return tuition + ADDITIONAL_FEES;
    }

    public String toString() {
        return ("Student name: " + super.getStudentName() + "\nStudent id: " + super.getStudentID() + "\nEnrolled: " + this.isEnrolled() + "\nGraduate assistant: " + this.isGraduateAssistant() + "\nGraduate assistant type: " + this.graduateAssistantType + "\nCourses enrolled: " + coursesEnrolled + "\nPayable Amount: " + this.getPayableAmount() + "\n");
    }
}
