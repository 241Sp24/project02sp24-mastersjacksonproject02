package studentdriver;

import java.util.*;
import java.io.*;

public class StudentDriver {

    public static void main(String[] args) throws Exception {
        System.out.println("Project02");
      
        StudentFees[] students = new StudentFees[12];
        Scanner input = new Scanner(new File("input.csv"));
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the no of UG Students: ");
        
        
        
        int nougS = user_input.nextInt();
        System.out.println("Enter the no of Graduate students: ");
        int nogS = user_input.nextInt();
        System.out.println("Enter the no of online students: ");
        int nooS = user_input.nextInt();
        //int totalStud = nougS + nogS + nooS;???
        //StudentFees[] students = new StudentFees[totalStud];???
        //create seperate for loops based off of user input, creates student objects;assigns to students[]
        System.out.println("**********Undergraduate students list************");
        for (int i = 0; i < nougS; i++) {
            //undergraduate student loop
            String[] nl = input.nextLine().split(",", 6);
            students[i] = new UGStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Boolean.parseBoolean(nl[4])), (Double.parseDouble(nl[5])), (Integer.parseInt(nl[3])));
            System.out.println(students[i]);
        }
        //System.out.println("**********Undergraduate students list************");
        //graduate student loop
        //if and else. true false
        System.out.println("**********Graduate students list************");
        int graduateStartIndex = nougS; 
        //System.out.println("**********Graduate students list************");
        for (int i = 0; i < nogS; i++) {
            //System.out.println("**********Graduate students list************");
            if (input.hasNext()){
                
                String[] nl = input.nextLine().split(",", 6);
                //int graduateStartIndex = nougS; 
                if(Boolean.parseBoolean(nl[4]) == true){
                    students[i + nougS] = new GraduateStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Boolean.parseBoolean(nl[4])), (nl[5]), (Integer.parseInt(nl[3])));
                
                }
                else{
                    students[i + nougS] = new GraduateStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Boolean.parseBoolean(nl[4])), (Integer.parseInt(nl[3])));
                }
                System.out.println(students[graduateStartIndex + i] );
        }
        }
        //System.out.println("**********Graduate students list************");
        System.out.println("**********Online students list************");
        int onlineStartIndex = graduateStartIndex + nogS;
        int count = 0;
        for (int i = nougS + nogS; i < students.length; i++) {
            if(input.hasNext()){
                String[] nl = input.next().split(",", 4);
                students[count] = new OnlineStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Integer.parseInt(nl[3])));
                count ++;
                System.out.println(students[onlineStartIndex + i]);
            }
        }
        //System.out.println("**********Online students list************");
        for (StudentFees a : students) {
            System.out.println(a);
        }
        //if instance of , check enrolled, check scholorship count.
//        for(StudentFees student : students){
  //          if (student instanceof UGStudent){
    //            UGStudent ugStudent = (UGStudent) student; 
      //          System.out.println("Student Name: " + ugStudent.getStudentName());
        //        System.out.println("Enrolled: " + ugStudent.isEnrolled());
          //      System.out.println("Scholorship count: " + ugStudent.getScholarshipAmount());
            //}
//            else if(student instanceof GraduateStudent){
  //              GraduateStudent gradStudent = (GraduateStudent) student; 
    //            System.out.println("Student name: " + gradStudent.getStudentName());
      //          System.out.println("Enrolled: " + gradStudent.isEnrolled());
        //    }
          //  else if(student instanceof OnlineStudent){
            //    OnlineStudent onlineStud = (OnlineStudent) student; 
              //  System.out.println("Student name" + onlineStud.getStudentName());
                //System.out.println("Enrolled: " + onlineStud.isEnrolled());
            //}
            //}
        double totalUndergraduateFees = 0;
        int totalUndergraduateScholarships = 0;
        int totalUndergraduateCourses = 0;
        for (int i = 0; i < nougS; i++) {
            totalUndergraduateFees += students[i].getPayableAmount();
            if (students[i] instanceof UGStudent) {
                UGStudent ugStudent = (UGStudent) students[i];
                totalUndergraduateScholarships += ugStudent.getScholarshipCount();
                totalUndergraduateCourses += ugStudent.getCoursesEnrolled();
    }
}
        double avgUndergraduateFees = totalUndergraduateFees / nougS;

// Calculate average student fee, graduate assistantship count, and total number of courses for graduate students
        double totalGraduateFees = 0;
        int totalGraduateAssistantships = 0;
        int totalGraduateCourses = 0;
        for (int i = nougS; i < nougS + nogS; i++) {
            totalGraduateFees += students[i].getPayableAmount();
                if (students[i] instanceof GraduateStudent) {
                    GraduateStudent gradStudent = (GraduateStudent) students[i];
                    if (gradStudent.isGraduateAssistant()) {
                        totalGraduateAssistantships++;
                    }
                    totalGraduateCourses += gradStudent.getCoursesEnrolled();
    }
}
        double avgGraduateFees = totalGraduateFees / nogS;

// Calculate average student fee and total number of courses for online students
        double totalOnlineFees = 0;
        int totalOnlineCourses = 0;
        for (int i = nougS + nogS; i < students.length; i++) {
            totalOnlineFees += students[i].getPayableAmount();
            if (students[i] instanceof OnlineStudent) {
                //5
                OnlineStudent onlineStudent = (OnlineStudent) students[i];
                //totalOnlineCourses += onlineStudent.getCoursesEnrolled();
    }
}
        double avgOnlineFees = totalOnlineFees / nooS;
        
        System.out.println("**********Undergraduate Students details**********");
        System.out.println("Average Students fee: " + avgUndergraduateFees);
        System.out.println("Scholarship count: " + totalUndergraduateScholarships);
        System.out.println("Total number of courses: " + totalUndergraduateCourses);

        System.out.println("**********Graduate Students details**********");
                
        System.out.println("Average Students fee: " + avgGraduateFees);
        System.out.println("Graduate Assistantship count: " + totalGraduateAssistantships);
        System.out.println("Total number of courses: " + totalGraduateCourses);

        System.out.println("**********Online Students details**********");
        System.out.println("Average Students fee: " + avgOnlineFees);
        System.out.println("Total number of courses: " + totalOnlineCourses);

        }
        
   }
    
