import static java.lang.System.out;
import  java.util.Scanner;
  class Program2{
	  
	    public static void main(String[] args){
			  var scanner = new Scanner(System.in);
                out.println("Enter the First Number");
                 var num1 = scanner.nextInt();				
              	 out.println("Enter the Secound Number");
                 var num2 = scanner.nextInt();
                     
                 out.println("""
				 Enter a, for add,
				 Enter b, for sub,
		         Enter c, for div,
				 Enter d, for Mul:,
				  """);
											 
							var operation = scanner.next();
							var result = 0;
							if(operation.equals("a")){
								  result = num1 + num2;
								
							} else if (operation.equals("b")){
								result = num1 - num2;
								
								
							}else if (operation.equals("c")){
								result = num1 / num2;
								
								
							}else if (operation.equals("d")){
								result = num1 * num2;
								
								
							}
							
							  out.println("Result :" + result);
											 
											 
											 
				 
			  
			  
			
			
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		}  
  }
  
	
	       