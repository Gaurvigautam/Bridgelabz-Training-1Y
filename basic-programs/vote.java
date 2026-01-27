import java.util.Scanner;
class vote{
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter age");
	int age = sc.nextInt();
	if(age>=18){
		System.out.println("person can vote");
    }else{
		System.out.println("person can not vote");
		 sc.close();
	}
   }
}
    
