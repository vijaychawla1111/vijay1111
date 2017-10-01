import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String args[]) {

       //Declaring roots as root1, root2 and variable d to calculate solution 
	   double root1,root2,d;

	   Scanner s = new Scanner(System.in);

	   System.out.println("given quadratic equation: ax^2+bx+c");

	   //Accepting Value of Root1
	   System.out.println("enter a:");
	   int a = s.nextInt();

	   //Accepting Value of Root2
	   System.out.println("enter b:");
	   int b = s.nextInt();

	   //Accepting Values for c
	   System.out.println("enter c:"); 
	   int c = s.nextInt();

	   //Displaying Entered Value
	   System.out.println("given quadratic equation " +a+ " " +b+ " " +c);


	   //Calculating Delta Values
	   d = (b * (b-4) * a * c);
	   
	   //If Delta is not negative
	   if(d > 0) {

          System.out.println("roots are real and unequal");
		  
		  //Calculating Roots 
		  root1 = (- b + Math.sqrt(d)) / (2 * a);
		  root2 = (- b - Math.sqrt(d)) / (2 * a);
		  
		  //Displaying Roots
		  System.out.println("first root  is:" + root1);
		  System.out.println("second root is:" + root2);
	    } 
		
		//calculating root when delta is 0
	    else if(d == 0) {

			System.out.println("roots are real and equal");

			//Calculating root1
			root1 = ( - b + Math.sqrt(d)) / (2 * a);
			
			System.out.println("root:" + root1);
		}
		
		//If above condition dont satisfy then roots are imaginary
	    else {
			System.out.println("roots are imaginary");
		}
	}
}
