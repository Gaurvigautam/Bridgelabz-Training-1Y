import java.util.Scanner;
public class PowerCalculation{
   static scanner sc = new scanner(System.in);
  public static void perimeter(){
    System.out.println("Enter the base:");
    double b = sc.nextDouble();
    System.out.println("Enter the exponenet:");
    int e = sc.nextInt();
    Double v= Maths.pow(b,e);
    System.out.println("The value is:"+v);
  }
  public static void main(String[] args){
  }
}
