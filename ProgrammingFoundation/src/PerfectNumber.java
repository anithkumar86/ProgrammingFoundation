
public class PerfectNumber {
	
	public static void main(String[] args) {
		boolean result = isPerfectNumber(28);
		if(result==true) {
			System.out.println("The number is a perfect number");
		}
		else
			System.out.println("The number is not a perfect number");
	}
	
		

		public static boolean isPerfectNumber(int number) {
		
		int digit = 0;
		int sum = 0;
		int temp = number;
		digit = number / 2;
		int counter = 0;
		
		while(digit>0) {
			
			counter = temp % digit;
			if(counter == 0) {
				sum = sum + digit;
				
				System.out.println(digit);			
			}
			digit--;
			
					
					
		
			
		}
			
		System.out.println(sum);
		if(temp == sum) {
			return true;
		}
		else
		return false;

}

}
