package operator;

public class CondititionalOperator {

	// && Conditional AND: all condition must have to be true
	// || Conditional OR: if one condition is true then block of code will execute
	
	// || pipe
	
	public static void main(String[] args) {
		
		int apple1=79;
		int apple2=89;
		int apple3=67;
		
		if(apple1==79 && apple2==89 && apple3== 67) { 
			
			System.out.println("apple is sweet");
		}
		
		if(apple1==79 && apple2==89 && apple3 > 89) {
			System.out.println("apple is not sweet");
		} 
			
		if(apple1==79 && apple2>88 && apple3< 68) {
			System.out.println("we love to eat apple");
			
		} 
		if(apple1==79||  apple2==95 && apple3== 67) {
			
			
			System.out.println( "than apple is green");
			
			} 
		
		if(apple1==79 || apple2==89 || apple3> 75) {
			
			System.out.println( "than apple are golden");
		} 
		
		
	}
	
}
