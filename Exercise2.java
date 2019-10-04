//Exercise2.java
/*This program uses user inputs to calculate volume of a 
 *cylinder*/

import java.util.Scanner;


public class Exercise2{
	public static void main(String args[])
	{
		
	final float PI=3.142f;
	
	float raduis, height;
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Please enter the raduis of the cylinder: ");
		raduis=input.nextFloat();
		
	System.out.print("Please enter the height of the cylinder: ");
		height=input.nextFloat();
		
	System.out.println("\n======Calculation Result======\n");
	
	System.out.print("Volume of cylinder is "+
		String.format("%.2f",(PI*raduis*raduis*height)) +" metres squared");
			
		
		
		
	}
}