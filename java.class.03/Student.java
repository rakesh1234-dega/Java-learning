
class Student{
	  String name; // global variable 
	  int age;
	  double marks;
	  
	  //constru
	   Student(String fullName,int fullAge,double fullmarks){
		   
		      name = fullName;
			  age = fullAge;
			  marks = fullmarks;   
	   }
	   
	   String displayName(){
		   
		   String result = name;
		   return name;
		   
	    }
        int  displayAge(){
			
			int result = age;
			 return age;
			
	 
         }
		double  displayMarks(){
			
			double result = marks;
			
			   return marks;
			
		}
		
	
	
}