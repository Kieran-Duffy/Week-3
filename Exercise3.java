//Exercise3.java
/*This program is a converter, allowing the user to change yards 
 *into meters*/ 

import java.util.Scanner;

public class Exercise3{
	public static void main(String args[])
	{
	
	float acres;
	
	final float CONVERSION=0.4046f;
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Please enter an area in acres: ");
	acres=input.nextFloat();
	
	System.out.println("\nThis is equivalent to "+
		String.format("%.3f", CONVERSION*acres) +" hectares");
	}
}