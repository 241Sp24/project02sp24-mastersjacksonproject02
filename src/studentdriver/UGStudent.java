package studentdriver;

public class UGStudent extends StudentFees {

    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;

    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }
    
    public double getPayableAmount() {
        if(isEnrolled()){
            //double totalCourseFees = coursesEnrolled * getCREDIT_PER_COURSE() * getPER_CREDIT_FEE();
            //double payableAmount = scholarshipAmount - (totalCourseFees + ADDITIONAL_FEE);
            //return Math.max(payableAmount, 0); // Ensure payable amount is non-negative
            return scholarshipAmount - (coursesEnrolled * getCREDIT_PER_COURSE() * getPER_CREDIT_FEE() + ADDITIONAL_FEE);
        }
        else{
            return 0;
        }
    }

    public String toString() {
        return super.toString() + String.format("Scholarship: %b\nPayable amount: %.2f\n", hasScholarship, scholarshipAmount, coursesEnrolled, getPayableAmount());
        //return ("Student name: " + super.getStudentName() + "\nStudent id: " + super.getStudentID() + "\nEnrolled: " + this.isEnrolled() + "\nScholarship: " + hasScholarship + "\nScholarship amount: " + scholarshipAmount + "\nCourses enrolled: " + coursesEnrolled + "\nPayable Amount: " + );
    }

}
