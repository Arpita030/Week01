import java.util.Scanner;

public class Bonus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();
        
		
		//condition
        if (yearsOfService > 5) {
            //calculate
            double bonus = (5.0 / 100) * salary;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus");
        }

        input.close();
    }
}
