
package studentdriver;


public class UGStudent extends StudentFees {
private double scholarshipAmount;
private int coursesEnrolled;
private boolean hasScholarship;
private double ADDITIONAL_FEE = 820.70;



public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
    super(studentName, studentID, isEnrolled);
    this.hasScholarship = hasScholarship;
    this.scholarshipAmount = scholarshipAmount;
    this.coursesEnrolled = coursesEnrolled;
}
public boolean isHasScholarship(){
    return hasScholarship;
}
public double getScholarshipAmount(){
    return scholarshipAmount;
}
public int getCoursesEnrolled(){
     return coursesEnrolled;
}
public double getPayableAmount(){
    
}
public String toString(){
    return ("Student name" + super.getStudentName()  + "\nStudent id: " + super.getStudentID() + "\nEnrolled: " + this.isEnrolled() + "\nScholarship" + hasScholarship + "\nScholarship amount: " + scholarshipAmount + "\nCourses enrolled: " + coursesEnrolled + "\nPayable Amount: " + this.getPayableAmount());
}

}
