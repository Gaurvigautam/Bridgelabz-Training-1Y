import java.util.Scanner;

class Oddeven{
    public static void main(String [] args){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number:");
	  int number = sc.nextInt();
	  
	  if (number>0){
		  for(int i = 1; i<=number; i++){
			  if(i%2 == 0){
				  System.out.println("is number is even"+i);
			  }else{
				  System.out.println("is number is Odd"+i);
			  }
		  }
	}else{
		System.out.println("Please enter the natural number.");
	}
		sc.close();
	}
}	
		  
	  
