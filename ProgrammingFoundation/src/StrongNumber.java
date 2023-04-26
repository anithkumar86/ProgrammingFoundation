
public class StrongNumber {
	
	public static void main(String[] args) {
		boolean result = isStrongNumber(145);
		if(result==true) {
			System.out.println("The number is a strong number");
		}
		else
			System.out.println("The numbers is not a strong number");
	}
	
	public static int calculatefact(int number) {
	
		int result = 1;
		int counter = number;
		
		while(counter>=1) {
			
			result = result * counter;
			counter--; // This is same formula like counter = counter - 1;
			
		}	

		return result;
	}
	public static boolean isStrongNumber(int number) {
		
		int digit = 0;
		int sum = 0;
		int temp = number;
		
		while(number>0) {
			digit = (number % 10);
					sum = sum + calculatefact(digit);
					
					System.out.println(digit);
					number = number / 10;
			
		}
			
		System.out.println(sum);
		System.out.println(number);
		if(temp == sum) {
			return true;
		}
		else
		return false;

}
}
