package operator;

public class UnaryOperator {
	

	// UnaryOperators
	// ++ Increment Operator: Increasing/Adding 1
	// PreIncrement  ++number   1+number
	// Post Increment number++   number+  1 for Future use
	
	// -- Decrement Operator: Decreasing/Minus 1
	// PreDecrement --number
	// PostDecrement number--
	
	public static void main(String[] args) {
		
		int number= 34;
		++ number;//35
		++number;//36
		++ number;//37
		++number;//38
		number++;//38+1=39
		number++;//40
		number++;//41
		--number;//40
		--number;//39
		--number;//38
		number--;//37
		number--;//36
		number--;//35
		--number;//34
		
		System.out.println(++number);//35
		System.out.println(++number);//36
		System.out.println(++number);//37
		System.out.println(++number);//38
		System.out.println(number++);//39
		System.out.println(number++);//40
		System.out.println(number++);//41
		System.out.println(number);//41
		System.out.println(--number);//40
		System.out.println(--number);//39
		System.out.println(++number);//40
		System.out.println(number--);//40
		System.out.println(number--);//38
		System.out.println(--number);//37
		
	}
	
	
	
	
	

}
