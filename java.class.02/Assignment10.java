 
 /*
 Assignment 10: Simple ATM Menu
-----
Create a program with an initial account balance of ₹5,000. Repeatedly display this menu:

1. Check balance
2. Deposit money
3. Withdraw money
4. Exit

Requirements:
- Deposit amounts must be positive.
- A withdrawal must not exceed the available balance.
- Display an error for an invalid menu choice.
- Continue showing the menu until the user selects 4.
- Stop the program after displaying Thank you.
 
 
 */
 import static java.lang.System.out;
 import java.util.Scanner;
 public class Assignment10{
	  public static void main(String[]args){
		  Scanner scanner = new Scanner(System.in);
		   int balance = 5000;
		   int pin = 77804;
		   
		   // int choice;//
			while(true){
				out.println("""
				    Enter 1 Check balance;
					Enter 2 Deposit money;
				    Enter 3 Withdraw money;
				    Enter 4 Exit
				""");
				int choice = scanner.nextInt();
				 switch(choice){
					 case 1 :
					       out.println("Enter the pin you can acess the account information");
					       int num  = scanner.nextInt();
						     
							  if(pin == num){
								  out.println("Total balance was the " + balance);  
							  } else {
								  out.println("check your pin you cannot sea the balance");
						   
					      
							  }
						 break;
					 case 2 :
                          out.println("Enter the Deposite Money");
                           int deposite = scanner.nextInt();
                            if(deposite > 0){
								balance = balance + deposite;
								out.println(" Money deposite Successfull");
								out.println("New balance : "+ balance);
							} else{
								
								  out.println("Amount must be postitve number");
								
							}
							break;
							
					  case 3 :
                          out.println("Enter the Withdraw money");
                           int withdraw = scanner.nextInt();
                            if(withdraw <= 0){
								
								out.println("Withdraw amount must positive");
							    
								
							}else if (withdraw > balance){
								   
								  out.println("Erro Amount was Insufficient balance");
								
							}else{
								  
								    balance = balance - withdraw;
									out.println("Money Withdraw scuccessfull");
									out.println("Remaining balance of your Account :  " + balance);
								
							}
							
							break;
							
							
				     case 4 :
                           out.println("Thank you");
                             scanner.close();
                             return;							 
								
					default :
                        out.println("Invalide menu choice pls check");					
					 
					 
				 }
				
			}
	 
	  } 
 }