import java.util.Scanner;

public class Nhandshakes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Conditions
        if (numberOfStudents < 2) {
            System.out.println("A minimum of 2 students is required to make handshakes.");
        } else {
            // Calculating the condition
            int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Printing the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + totalHandshakes);
        }

        sc.close();
    }
}
