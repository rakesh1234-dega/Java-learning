/*Assignment 8: Digit Analyser
-----
Accept a positive integer and calculate:
- The number of digits
- The sum of its digits
- The reversed number

Example:
Input: 4825
Output:

Number of digits: 4
Sum of digits: 19
Reversed number: 5284*/

import static java.lang.System.out;
import java.util.Scanner;
public class Assignment8{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		out.println("Enter the Positive integer");
		 int number = scanner.nextInt();
		  int temp = number;
		  int digitscount = 0;
		   int sum = 0;
		   int reverse = 0;
		   
		    while(temp > 0){
				
				int digit = temp % 10;
				 digitscount++;
				 
				 sum = sum + digit;
				  reverse = reverse * 10 + digit;
				  temp = temp / 10;				  
				
			}
			
			out.println("Number of digits: " + digitscount);
			out.println("Sum of digits: " + sum);
		    out.println(" Reversed Number: " + reverse);
	
	    scanner.close();
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}