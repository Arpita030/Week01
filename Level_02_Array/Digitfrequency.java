import java.util.Scanner;

public class Digitfrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNum = input.nextInt();

        int digitFrequency[] = new int[10];

        while (inputNum != 0) {
            int digit = inputNum % 10; 
            digitFrequency[digit]++;     
            inputNum /= 10;           
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] > 0) { 
                System.out.println("Digit " + i + ": " + digitFrequency[i] + " time(s)");
            }
        }
    }
}
