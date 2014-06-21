package ch1prob;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Michael Althoff <dalthoff@unca.edu>
 */
//Ch 1 programming problem from 202 book.  Registrar problem with Student class
//Extended to try different data structures
public class ch1Prob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        //Creates new linked list for students
        List<Student> students = new LinkedList<>();
        //Creates a new student and sets credits and gradepoints
        Student kid2 = new Student("Billy Bob", 1920);
        kid2.setCredits(14);
        kid2.setGradePts(42.0);

        students.add(kid2);
        if (KeyEvent.KEY_PRESSED == 27) {
            System.exit(0);
        } else {
            //Prompts for student info input
            System.out.println("Enter Student's name and press ENTER: ");
            String input = stdin.nextLine();
            System.out.println("Enter Student's ID and press ENTER: ");
            String inputNum = stdin.nextLine();
            //Changes the string ID input to an integer for making the student object
            int inputID = Integer.parseInt(inputNum);
            //Creates student object with input information
            Student stuInput = new Student(input, inputID);

            //Adds student to the linked list
            students.add(stuInput);

        }

        //Loop shows each student in the list
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}
