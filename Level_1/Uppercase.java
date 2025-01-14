import java.util.Scanner;

public class Uppercase {

    public static String UpperCase(String text) {
		String result="";
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)<'a'){
				result+=text.charAt(i);
			}
			else if(text.charAt(i)>='a'){
				result+=(char)(text.charAt(i)-32);
			}
        }
        return result;
    }

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
		String upperCaseUsingCharAt=UpperCase(text);
		String upperCaseUsingUpperCase=text.toUpperCase();
        boolean areEqual = stringComparison(upperCaseUsingCharAt,upperCaseUsingUpperCase);
		
		System.out.println("User Defined method :"+upperCaseUsingCharAt);
	    System.out.println(" Built In method toUpperCase() :"+upperCaseUsingUpperCase);
	    System.out.println("Comparing result from both the methods if the string are equal:"+areEqual);

 
		input.close();
    }
}