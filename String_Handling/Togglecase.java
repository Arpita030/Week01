import java.util.Scanner;
public class Togglecase{
		public static String togglecase(String s){
			 String converted_string="";
			for(int i=0; i<s.length();i++){
				if(s.charAt(i)<='Z'){
					converted_string+=(char)(s.charAt(i)+32);
			      }
			    else if(s.charAt(i)>='a'){
					converted_string+=(char)(s.charAt(i)-32);
					
				}
		}
		return converted_string;
    }
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string :");
			String s=sc.next();
			String result=togglecase(s);
			System.out.println("result after togglecase :"+ result);
		}
}