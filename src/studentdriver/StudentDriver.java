package studentdriver;

import java.util.*;
import java.io.*;

public class StudentDriver {

    public static void main(String[] args) throws Exception {
        System.out.println("Project02");

        StudentFees[] students = new StudentFees[12];
        Scanner input = new Scanner(new File("input.csv"));
        //create seperate for loops based off of user input, creates student objects;assigns to students[]
        String[] nl = input.nextLine().split(",", 6);
        //UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled)
        students[0] = new UGStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Boolean.parseBoolean(nl[4])), (Double.parseDouble(nl[3])), (Integer.parseInt(nl[5])));
        System.out.println("**********Undergraduate students list**********");

        System.out.println("***********Graduate students list**********");

        System.out.println("**********Online students list**********");

    }
}
