import java.util.Scanner;
public class Divisibleby5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		if(number % 5 ==0){
			System.out.println("number is Divisible");
		}else{
				System.out.println("number is not Divisible");
			}
		}
	}

