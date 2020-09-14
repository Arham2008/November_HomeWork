package constructor;

public class ConstuctorPractic {


	// Constructor Name will be same as Class Name.
	// Constructor Has no Return Type
	// Constructors are used to initialize the object.
	// Before creating Parameterize constructor we must have to create Default
	// constructor

	// Parameter/ Signature/Pattern 
	
	// Default/ non Parameterized Constructor
	// Parameterized Constructor

	// AccessModifier className(){ }
	
	String city;
	int age1;
	float price1;
      public ConstuctorPractic () {
    	  
    	  //System.out.println( "my name is muneer");
    	   }
      
      public ConstuctorPractic ( String name) {
    	  
    	 
    	  this.city =name;
    	  
    	 System.out.println(this.city);
    	
    	  }
      
    
      
      // multi parameterize
      public  ConstuctorPractic (String name, int age) {
    	  
    	  this.age1= age;
    	  this.city=name;
    	  System.out.println("my age "+this.age1 + " "+ "my name is "+this.city);
    	  //System.out.println(this.age1 + this.city);
    	  
      }
      
      public  ConstuctorPractic( String name, int age,float price  ) {
    	  
    	  this.city=name;
    	  this.age1=age;
    	  this.price1=price;
    	  
    	  System.out.println(this.city+"  , " + this.age1+" , "+this.price1);
}   	 
      
      
     
          public static void main(String[] args) {
		
    	  ConstuctorPractic learn =new ConstuctorPractic ();
    	  
    	  ConstuctorPractic  demo =new ConstuctorPractic("akbar muneer");// argument passing
    	  
    	  ConstuctorPractic lah=new ConstuctorPractic("arham hussan",15);
    	  
    	  ConstuctorPractic mul=new   ConstuctorPractic(" rashaid hussan", 2500, 23.99f);
    	  
          
          } 
	}
