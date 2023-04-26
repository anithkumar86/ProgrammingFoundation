
public class ArmStrongNumber {
	
	public static void main(String[] args) {
		boolean result = isArmStrong(153);
		if(result==true) {
			System.out.println("The number is a strong number");
		}
		else
			System.out.println("The numbers is not a strong number");
	}
	
		public static boolean isArmStrong(int number) {
		
		int digit = 0;
		int sum = 0;
		int temp = number;
		
		while(number>0) {
			digit = (number % 10);
					sum = sum + digit*digit*digit;
					
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
