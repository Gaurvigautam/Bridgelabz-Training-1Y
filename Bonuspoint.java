import java.util.Scanner;

class Employeesalary{
    public static void main(String [] args){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter employee salary");
	  double salary = sc.nextDouble();
	  
	  System.out.println("Enter the service years");
	  double years = sc.nextDouble();
	  
	  if(year>5){
		  double bonus = salary *0.05;
				System.out.println("amount of Bonus"bonus);  
		  }else {
			  System.out.println("no bonus year of service is less than or equal 5. ");  
		  }
		  }
	  }
	  sc.close();
	}
}