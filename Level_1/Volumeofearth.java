
import java.util.*;
public class Volumeofearth{
	public static void main (String[]args){
		
		//intializing and declaring of variable
		double radius =6378;
		double radiusMile=6378*0.6;
		
		//compute the volume 
		double volume=((double)4/3) * Math.PI * (Math.pow(radius,3));
		double volumeMile=((double)4/3) * Math.PI * (Math.pow(radiusMile,3));
		
        //display the volume in km and mile
		System.out.println("The volume of earth in cubic kilometers is"+ volume +"and cubic miles is "+volumeMile);
	}
}
		