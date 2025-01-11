import java.util.Scanner;

public class Youngfriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for ages
        System.out.print("Enter the age of Amar: ");
        int age1 = input.nextInt();
        System.out.print("Enter the age of Akbar: ");
        int age2 = input.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int age3 = input.nextInt();

        // Taking input for heights
        System.out.print("Enter the height of Amar (in cm): ");
        double height1 = input.nextDouble();
        System.out.print("Enter the height of Akbar (in cm): ");
        double height2 = input.nextDouble();
        System.out.print("Enter the height of Anthony (in cm): ");
        double height3 = input.nextDouble();

        // Determine the young friend
        String youngName;
        int youngAge;

        if (age1 < age2 && age1 < age3) {
            youngName = "Amar";
            youngAge = age1;
        } else if (age2 < age1 && age2 < age3) {
            youngName = "Akbar";
            youngAge = age2;
        } else {
            youngName = "Anthony";
            youngAge = age3;
        }

        // Determine the tall friend
        String tallName;
        double tallHeight;

        if (height1 > height2 && height1 > height3) {
            tallName = "Amar";
            tallHeight = height1;
        } else if (height2 > height1 && height2 > height3) {
            tallName = "Akbar";
            tallHeight = height2;
        } else {
            tallName = "Anthony";
            tallHeight = height3;
        }

        // Display the results
        System.out.println("The young friend is " + youngName + " with age " + youngAge + " years.");
        System.out.println("The tall friend is " + tallName + " with height " + tallHeight + " cm.");

        input.close();
    }
}
