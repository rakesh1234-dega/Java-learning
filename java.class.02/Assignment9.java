/*Assignment 9: Skip Multiples of Three
-----
Accept a positive integer N. Display all numbers from 1 to N, except numbers divisible by 3.

Example:

Input: 10
Output: 1 2 4 5 7 8 10*/


        import static java.lang.System.out;
		import java.util.Scanner;
		public class Assignment9{
			
			public static void main(String[]args){
			
				  out.println("Enter the Num:")
				 Scanner scanner = new Scanner(System.in);
				     int n = scanner.nextInt();
				   
				    for(int i=0;i<=n;i++){
						if(i%3==0){
							continue;
							
						}
						out.println(i+"");
						
						
						
						
					}
					scanner.close();
	
			
			}
			
		}
		