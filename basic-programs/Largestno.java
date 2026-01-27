import java.util.Scanner;
class Largestno{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int number2 = sc.nextInt();
		
		System.out.println("Enter the third number");
		int number3 = sc.nextInt();
		
	        System.out.println( "Is the first number the largest?"+
			(number1>number2 && number1>number3 ? "yes":"No"));
		
			System.out.println(" Is the second number the largest?"+
	        (number2>number1 && number2>number3 ? "yes":"No"));
		
			System.out.println(" Is the third number the largest?"+
			(number3>number1 && number3>number2 ? "yes":"No"));
		
	}
}
			