
import java.util.Scanner;
public class Main {

	// with arg with return
	// mehthod function :

	public static float add(float a, float b) {
		return a + b;

	}

	public static float sub(float a, float b) {
		return a - b;
	}

	public static float mul(float a, float b) {
		return a * b;
	}

	public static float div(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		// we need to call all the functionalities and it should be like a menu driven
		// program.

		// how to show all methods as an option to my user?
		// switch case
		
		
		Scanner scanner = new Scanner (System.in);
			
		while(true) {
			System.out.println("Enter the options based on choice"
					+ "\n 1. Add \n 2. Sub \n 3. Mul \n 4. Div \n 5. Exit");
					System.out.println("Input choice here"+"\n");
					
		int choice = scanner .nextInt();

		switch (choice) {

		case 1: {
			System.out.println("addition case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result1 = add(number1,number2);
			System.out.println("Addition Result is"+result1);

		}
			break;
		case 2: {

			System.out.println("substract case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = sub(number1,number2);
			System.out.println("subtract Result is"+result);
		}
			break;
		case 3: {
			System.out.println("Multiplication case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result1 = mul(number1,number2);
			System.out.println("Multiplication Result is"+result1);

		}
		break;
		case 4: {
			System.out.println("Division case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result1 = div(number1,number2);
			System.out.println("Division Result is"+result1);

		}
		break;
		case 5: {
			System.out.println("Exiting");
			System.exit(0);

		}
			break;
			default:{
				System.out.println("default case");
			}

		}
		}
		
	}
}