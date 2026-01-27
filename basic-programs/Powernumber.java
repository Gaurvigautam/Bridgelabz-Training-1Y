import java.util.Scanner;

public class Powernumber {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = sc.nextInt();
		
		System.out.print("Enter a Power:");
        int Power = sc.nextInt();
		
		if(number>0 && Power>= 0){
			
			int result = 1;
			for(int i=1; i<=Power; i++){
				result = result * number;
			}
            System.out.println(+result);
		
        } else {
            System.out.println("Please enter positive integers only.");
        }
        sc.close();
    }
}


