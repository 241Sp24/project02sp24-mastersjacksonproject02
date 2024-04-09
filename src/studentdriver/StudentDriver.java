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
        for (int i = 0; i < nougS; i++) {
            //undergraduate student loop
            String[] nl = input.nextLine().split(",", 6);
            students[i] = new UGStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Boolean.parseBoolean(nl[4])), (Double.parseDouble(nl[3])), (Integer.parseInt(nl[5])));
        }
        //graduate student loop
        for (int i = 0; i < nogS; i++) {
            String[] nl = input.nextLine().split(",", 6);
            students[i + nougS] = new GraduateStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Boolean.parseBoolean(nl[4])), (nl[5]), (Integer.parseInt(nl[3])));
        }
        for (int i = 0; i < nooS; i++) {
            String[] nl = input.nextLine().split(",", 6);
            students[i + nougS + nougS] = new OnlineStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Integer.parseInt(nl[5])));
        }
        for (StudentFees a : students) {
            System.out.println(a);
        }

    }
}
