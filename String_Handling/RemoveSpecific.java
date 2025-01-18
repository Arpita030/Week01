import java.util.Scanner;

public class RemoveSpecific {

    public static String remove(String s1, char character) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != character) {
                result += s1.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string :");
        String s1 = input.nextLine();

        System.out.println("Character to Remove :");
        char character = input.next().charAt(0);

        String result = remove(s1, character);

        System.out.println("String after removing character :" + result);

    }

}