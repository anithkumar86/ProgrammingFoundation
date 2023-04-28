
public class ReverseNumber {
	public static void main(String[] args) {
	int result = reverse(123);
		
	}
		

	public static int reverse(int number) {
		
			int digit = 0;
			int temp = number;
			
			while(temp>0) {
				digit = (temp % 10);
												
						System.out.println(digit);
						temp = temp / 10;
				
			}			
					
		
			
		}
			
		

}





