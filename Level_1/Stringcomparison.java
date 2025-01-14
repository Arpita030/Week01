import java.util.Scanner;
public class Stringcomparison{
	
	public  static boolean stringComparison(String s1, String s2){
		if (s1.length()== s2.length()){
			for(int i=0; i<s1.length();i++){
				if (s1.charAt(i)!=s2.charAt(i)){
					return false;
				}
				else{
					return true;
				}
			}
			
		}	
		return false;
				
	}
	
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Enter String 1");
		String s1=input.next();
		
	    System.out.println("Enter String 2");
		String s2=input.next();
		
		
		System.out.println("String comparison result using charAt():"+stringComparison(s1,s2));
		System.out.println("String comparison result using equals():"+s1.equals(s2));
	    input.close();
	}
}