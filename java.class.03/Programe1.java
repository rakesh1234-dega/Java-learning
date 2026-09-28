 import static  java.lang.System.out;
 import java.util.Scanner;
  class Programe1{
	  public static void main(String[] args){
		   Scanner scanner = new Scanner(System.in);
		   out.println("Enter 1st Number");
		   int firstNum = scanner.nextInt();
			out.println("Enter 2nd Number");
			
		    int secoundNum = scanner.nextInt();	
			Mathematics object = new Mathematics(firstNum,secoundNum);			
			int addResult = object.add();
			out.println("Addition Result :"+ addResult);
			int divideResult = object.divide();
			out.println("Divide Result :"+ divideResult);
			int subtractResult = object.subtract();
			out.println("Subtract Result :"+ subtractResult);
			int multiplyResult = object.multiply();
			out.println("Multiply Result :"+ multiplyResult);
			
			   
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }
  }