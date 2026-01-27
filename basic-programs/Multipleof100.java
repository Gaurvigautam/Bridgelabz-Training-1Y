import java.util.Scanner;

public class Multipleof100 {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        if (number >0 && number<100 ) {
			
			System.out.print("multiple of number"+number);
	        for(int i = 100; i>=1; i--){
				if(i % number == 0){
					 System.out.print(i);
				}
			}
	}else{
		System.out.print("please enter a positive number");
	}
	sc.close();
	}
}
