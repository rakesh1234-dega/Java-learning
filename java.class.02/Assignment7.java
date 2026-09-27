/*
Assignment 7: Multiplication Table Generator
-----
Accept a positive integer and display its multiplication table from 1 to 10.

Example for input 5:

5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

*/
import static java.lang.System.out;
import java.util.Scanner;
public class Assignment7{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		 out.println("Enter the number");
		  int number = scanner.nextInt();
		   for ( int i=1;i<=10;i++){
			        int sum = number * i;
					out.println(number +"*"+ i + "="+ sum);
			      
		   }
		    scanner.close();
		
		
		
		
		
		
		
		
	}
}