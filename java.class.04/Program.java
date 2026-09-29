import static java.lang.System.out;
  class Program{
	  public static void main(String[]args){
		   
		   Addition addition = new Addition();
		  /// int byteResult = addition.addByte((byte) 10,(byte) 2); //
		   byte num1 = 10;
		   byte num2 = 25;
		   int byteResult = addition.add(num1,num2);
		   out.println(byteResult);
		    long  shortResult= addition.add(num1,num2);
		   out.println(shortResult);
		    long intsResult = addition.add(10,99);
		   out.println(intsResult);
		    long longResult = addition.add(77L ,88L);
		   out.println(longResult);
		     double doubleResult = addition.add(77.2 ,88.6);
		   out.println(doubleResult);
		     float  floatResult = addition.add(77.2F ,88.6F);
		   out.println(floatResult);
		   
		   
		   
		   
		   
		   
		   
		   
		 
	
	  
	  }  
	  
  }