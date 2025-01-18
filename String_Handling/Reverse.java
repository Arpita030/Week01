import java.util.Scanner;
public class Reverse{
	public static String reverseString(String s){
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}
		return reverse;
	}
	public static void main(String []args){
		System.out.println("Enter a String :");
		Scanner input=new Scanner(System.in);
		String s=input.next();
		System.out.println("Reversed String:"+reverseString(s));
		
	}
}