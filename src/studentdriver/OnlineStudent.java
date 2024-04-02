
package studentdriver;


public class OnlineStudent extends StudentFees {
private int noOfMonths;
private double MONTHLY_FEE = 1245.25;

public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int onOfMonths){
    super(studentName, studentID, isEnrolled);
    this.noOfMonths = noOfMonths;

}
public double getPayableAmount(){
    return MONTHLY_FEE * noOfMonths;
}
public String toString(){
        return ("Student name" + super.getStudentName()  + "\nStudent id: " + super.getStudentID() + "\nEnrolled: " + this.isEnrolled() + "No of months: " + noOfMonths + "\nPayable Amount: " + this.getPayableAmount());
}
}
