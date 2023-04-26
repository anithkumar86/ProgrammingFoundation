
public class FactorialDemo {

	public static void main(String[] args) {
		
		int number = 5;
		int result = 1;
		int counter = number;
		
		while(counter>=1) {
			
			result = result * counter;
			counter--; // This is same formula like counter = counter - 1;
			
		}
System.out.println("The Factorial is "+result);
		
	}
}
