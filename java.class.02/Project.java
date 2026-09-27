package project;
import static java.lang.System.out;
import java.util.Scanner;
public class Project{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int total = 0;
			  int quantity =0;
			  int money = 1000;
		 out.println("""
	
            Product List:
            
            1. Notebook (A5 size)      - ₹50
            2. Ballpoint Pen (Pack of 5) - ₹75
            3. Water Bottle (1L)       - ₹120
            4. Cotton T-Shirt          - ₹350
            5. Jeans                   - ₹800
            6. Backpack                - ₹1200
            7. Bluetooth Earphones     - ₹1500
            8. Wrist Watch             - ₹2000
            9. Sneakers                - ₹2500
            10. Power Bank (10,000 mAh) - ₹1800
			
            """);
			  
			   while(true){
				  out.println("Selected the items(exit use 0) ");
			  int product = scanner.nextInt();
			  if(product == 0){
				  out.println(" Shopping finished");
				  break;
			  }
			  
			     switch(product){
					case 1:
					    total += 50;
					    quantity++;
						break;
					case 2:
						 total += 50;
					     quantity++;
						break;
					case 3:
						 total += 50;
					     quantity++;
						break;
					case 4:
						 total += 50;
					     quantity++;
						break;
					case 5:
						 total += 50;
					     quantity++;
						break;
					case 6:
						 total += 50;
					     quantity++;
						break;
					case 7:
						 total += 50;
					     quantity++;
						break;
					case 8:
						 total += 50;
					     quantity++;
						break;
					case 9:
						 total += 50;
					     quantity++;
						break;
					case 10:
						 total += 50;
					     quantity++;
						break;
				    
		          default:
                out.println("Invalid choice!");
               }

					 
				 }
			  
			
			
			  
			  
			   /*  if (product == 1){
					 total += 50;
					 quantity++;
					 
				 }else if(product == 2){
					 
					 total += 75;
					  quantity++;
				 }  else if(product == 3){
					 
					 total += 120;
					  quantity++;
				 } else if(product == 4){
					 
					 total += 350;
					  quantity++;
				 } else if(product == 5){
					 
					 total += 800;
					  quantity++;
				 } else if(product == 6){
					 
					 total += 1200;
					  quantity++;
				 } else if(product == 7){
					 
					 total += 1500;
					  quantity++;
				 } else if(product == 8){
					 
					 total += 2000;
					  quantity++;
				 } else if(product == 9){
					 
					 total += 2500;
					  quantity++;
				 } else if(product == 10){
					 
					 total += 1800;
					  quantity++;
				 } else{
					 out.println("Invalid choice! Please enter a number between 1 and 10.");
             
				 }*/
			   
				   
				 
				   
				 out.println("Quantity of the product: " + quantity);
				 out.println("Total Amount : "+ total);
				 
				      out.println("know the pay the amount ");
					  
					    if(total <= money){
							int balance  = money - total;
							out.println("Remaning money balance : "+ balance);
						}else{
							int need = total - money;
							out.println("Not enough money! You need ₹" + need + " more money .");
					 
						}

		
	}
	
}