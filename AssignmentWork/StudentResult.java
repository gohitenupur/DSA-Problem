package AssignmentWork;

import java.util.Scanner;

// Question Number -6
public class StudentResult {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int rollNo[] = new int[50];
        int subjectA[] = new int[50];
        int subjectB[] = new int[50];
        int subjectC[] = new int[50];
        double avg[] = new double[50];

        for (int i = 0; i < 50; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            System.out.print("Subject A Marks: ");
            subjectA[i] = in.nextInt();
            System.out.print("Subject B Marks: ");
            subjectB[i] = in.nextInt();
            System.out.print("Subject C Marks: ");
            subjectC[i] = in.nextInt();
            avg[i] = (subjectA[i] + subjectB[i] + subjectC[i]) / 3.0;
        }

        System.out.println("\nRoll No     Average Marks");
        for (int i = 0; i < 50; i++) {
            System.out.println(rollNo[i] + "    " + avg[i]);
        }

        System.out.println("\nStudents with Average above 80:");
        for (int i = 0; i < 50; i++) {
            if (avg[i] > 80)
                System.out.println(rollNo[i] + "    " + avg[i]);
        }

        System.out.println("\nStudents with Average below 40:");
        for (int i = 0; i < 50; i++) {
            if (avg[i] < 40)
                System.out.println(rollNo[i] + "    " + avg[i]);
        }
    }
}
