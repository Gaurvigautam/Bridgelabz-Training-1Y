import java.util.Scanner;
class SumofNaturalno{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number = sc.nextInt();
	
	    int sum = number*(number+1)/2;
		if (number>0){
			System.out.println("The number of Naturalno is."+sum);
		}else{
			System.out.println("The number is not a Naturalno");
		}
	}
}