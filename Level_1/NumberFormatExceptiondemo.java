import java.util.*;

public class NumberFormatExceptiondemo {

    public static void generateException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            handleException(e);
        }
		  catch(RuntimeException e){
			  handleGenericException(e);
		  }
    }
    
    public static void handleException(Exception e) {
        System.out.println("NumberFormatException Occurred: " + e.getMessage());
    }
	 public static void handleGenericException(Exception e) {
        System.out.println("Generic Exception Occurred: " + e.getMessage());
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.next();
        generateException(text);
    }
}
