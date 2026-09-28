import static java.lang.System.out;
 import java.util.Scanner;
   public class Programe{
	   
	   public static void main(String[] args){
	    
		 Scanner scanner = new Scanner(System.in);
		  
		    out.println("Enter your name ");
			String fullName =scanner.nextLine();
			
			  out.println("Enter your age");
			int fullAge =scanner.nextInt();
			
			  out.println("Enter your Marks ");
			double fullMarks =scanner.nextDouble();			
		   Student object = new Student(fullName,fullAge ,fullMarks);
		   
		    String name = object.displayName();
			out.println("Your name is "+ name);
			
			int age = object.displayAge();
			out.println("Your age is "+ age);
			
			double marks = object.displayMarks();
			out.println("Your Marks is "+ marks);
			
	       
	   
	   
	   
	   } 
   }