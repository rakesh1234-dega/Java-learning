 import static java.lang.System.out;
 
 import java.util.Scanner;
 
   class Programe {
	   
	   public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
			
			out.print("Enter 1st Number");
			int firstNum =scanner.nextInt();
			out.print("Enter 2st Number");
			int secoundNum =scanner.nextInt();
			
			Mathematics object = new Mathematics(firstNum,secoundNum);
			
			int addResult = object.add();
			out.println("Addition Result:" + addResult);
				int divideResult = object.divide();
			out.println("Addition Result:" + divideResult);
			
				int subtractResult = object.subtract();
			out.println("Addition Result:" + subtractResult);
				int multiplyResult = object.multiply();
			out.println("Addition Result:" + multiplyResult);
		
	   }		     
	   
   }