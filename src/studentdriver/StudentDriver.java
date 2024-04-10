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
        for (int i = 0; i < nooS; i++) {
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
        for(StudentFees student : students){
            if (student instanceof UGStudent){
                UGStudent ugStudent = (UGStudent) student; 
                System.out.println("Student Name: " + ugStudent.getStudentName());
                System.out.println("Enrolled: " + ugStudent.isEnrolled());
                System.out.println("Scholorship count: " + ugStudent.getScholarshipAmount());
            }
            else if(student instanceof GraduateStudent){
                GraduateStudent gradStudent = (GraduateStudent) student; 
                System.out.println("Student name: " + gradStudent.getStudentName());
                System.out.println("Enrolled: " + gradStudent.isEnrolled());
            }
            else if(student instanceof OnlineStudent){
                OnlineStudent onlineStud = (OnlineStudent) student; 
                System.out.println("Student name" + onlineStud.getStudentName());
                System.out.println("Enrolled: " + onlineStud.isEnrolled());
            }
            }
        }
        
   }
    
