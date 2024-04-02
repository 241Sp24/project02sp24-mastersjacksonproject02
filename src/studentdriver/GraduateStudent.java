
package studentdriver;


public class GraduateStudent extends StudentFees {
private int coursesEnrolled;
private boolean isGraduateAssistant;
private String graduateAssistantType;
private double ADDITIONAL_FEES = 654.45;

public  GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
    super(studentName, studentID, isEnrolled);
    this.coursesEnrolled = coursesEnrolled;
    this.isGraduateAssistant = isGraduateAssistant;
    this.graduateAssistantType = graduateAssistantType;
}
public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled){
    super(studentName, studentID, isEnrolled);
    this.coursesEnrolled = coursesEnrolled;
    this.isGraduateAssistant = isGraduateAssistant;
}
public boolean isGraduateAssistant(){
    return isGraduateAssistant;
}
public int getCoursesEnrolled(){
    return coursesEnrolled;
}
public double getPayableAmount(){
    //double tuitionFee = calculateTuitionFee();
    double totalFee = tuitionFee + ADDITIONAL_FEES;
        if (isGraduateAssistant) {
            if ("full".equalsIgnoreCase(graduateAssistantType)) {
                totalFee -= tuitionFee;
            } else if ("half".equalsIgnoreCase(graduateAssistantType)) {
                totalFee -= tuitionFee / 2;
}
public String toString(){
        return ("Student name" + super.getStudentName()  + "\nStudent id: " + super.getStudentID() + "\nEnrolled: " + this.isEnrolled() + "\nGraduate assistant: " + this.isGraduateAssistant()+ "Graduate assistant type: " + this.graduateAssistantType + "\nCourses enrolled: " + coursesEnrolled + "\nPayable Amount: " + this.getPayableAmount());
}
}

