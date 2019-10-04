//DistanceConverter.java
/*This program is a converter, allowing the user to change yards 
 *into meters*/  


import java.util.Scanner;

public class DistanceConverter{
	public static void main(String args[])
	{
		float yards;
		final float CONVERSION=0.9144f;
		
 Scanner input=new Scanner(System.in);
 
 System.out.print("Please enter the distance in yards: ");
 yards=input.nextFloat();
 
 System.out.println("\n\nThe equivelent distance in meters is "+
 	String.format("%.2f",CONVERSION*yards) +" meters");
				
	}

  }