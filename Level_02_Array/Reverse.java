import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
		 
        Scanner input = new Scanner(System.in);
		
// declaring a variable number
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();
		
		int temp=num;

        int count=0;
		while(temp!=0){
			temp/=10;
			count++;
		}
		
		 int[] digits = new int[count];

        for (int i = 0; i <count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

     //display the the result
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

    }
}