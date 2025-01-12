import java.util.Scanner;

public class Multidimensionalbmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     // take input for user
        System.out.print("Enter the number of persons: ");
        int numPerson = input.nextInt();

     // declare array
        double[][] personData = new double[numPerson][3];
        String[] weightStatus = new String[numPerson];   

       
        for (int i = 0; i < numPerson; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            
            for (int j = 0; j == 0;) { 
                System.out.print("Enter height in cm : ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] > 0) {
                    break; 
                }
                System.out.println("Invalid input. Please enter a positive height.");
            }

      
            for (int j = 0; j == 0;) { 
                System.out.print("Enter weight in kg: ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] > 0) {
                    break; 
                }
                System.out.println("Invalid input. Please enter a positive weight.");
            }

     // Converting height to meter
            double heightInMeters = personData[i][0] / 100.0;

     // Calculating BMI
            personData[i][2] = personData[i][1] / (heightInMeters * heightInMeters);

    // Determining BMI status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

   // Printing results
        System.out.println("\nBMI Details of All Persons:");
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");

        for (int i = 0; i < numPerson; i++) {
            System.out.printf("%.1f\t\t%.1f\t\t%.2f\t\t%s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }
}