
package studentdriver;


public class OnlineStudent extends StudentFees {
private int noOfMonths;
private static final double MONTHLY_FEE = 1245.25;

public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int onOfMonths){
    super(studentName, studentID, isEnrolled);
    this.noOfMonths = noOfMonths;

}

@Override
public double getPayableAmount(){
    if(isEnrolled()){
        return MONTHLY_FEE * noOfMonths;
}
else {
        return 0; 
    }
}
@Override
public String toString(){
    
    return super.toString() + String.format("No of months: %d\n" + "Payable Amount:  %.2f\n", noOfMonths,  getPayableAmount() + "\n");
//        return ("Student name: " + super.getStudentName()  + "\nStudent id: " + super.getStudentID() + "\nEnrolled: " + this.isEnrolled() + "\nNo of months: " + noOfMonths + "\nPayable Amount: " + this.getPayableAmount());
}
}
