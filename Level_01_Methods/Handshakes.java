import java.util.Scanner;

public class Handshakes{

    //  calculate maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        //Checking conditions
        if (students < 2) {
            System.out.println("There must be at least 2 students to form handshakes.");
        } else {
            int handshakes = calculateHandshakes(students);

            // Showing the result
            System.out.println("The maximum number of handshakes among " + students + " students is: " + handshakes);
        }

        sc.close();
    }
}