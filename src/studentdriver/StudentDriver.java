package studentdriver;

import java.util.*;
import java.io.*;

public class StudentDriver {

    public static void main(String[] args) throws Exception {
        System.out.println("Project02");

        StudentFees[] students = new StudentFees[12];
        Scanner input = new Scanner(new File("input.csv"));
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the number of Undergraduate Students: ");
        int nougS = user_input.nextInt();
        System.out.println("Enter the number of Graduate Students: ");
        int nogS = user_input.nextInt();
        System.out.println("Enter the number of Online Students: ");
        int nooS = user_input.nextInt();
        //create seperate for loops based off of user input, creates student objects;assigns to students[]
        for (int i = 0; i < nougS; i++) {
            //undergraduate student loop
            String[] nl = input.nextLine().split(",", 6);
            students[i] = new UGStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Boolean.parseBoolean(nl[4])), (Double.parseDouble(nl[3])), (Integer.parseInt(nl[5])));
        }
        //graduate student loop
        for (int i = 0; i < nogS; i++) {
            String[] nl = input.nextLine().split(",", 6);
            students[i + nougS] = new GraduateStudent((nl[1]), (Integer.parseInt(nl[0])), (Boolean.parseBoolean(nl[2])), (Boolean.parseBoolean(nl[3])), (nl[4]), (Integer.parseInt(nl[5])));
        }
        System.out.println("**********Undergraduate students list**********");

        System.out.println("***********Graduate students list**********");

        System.out.println("**********Online students list**********");

    }
}
