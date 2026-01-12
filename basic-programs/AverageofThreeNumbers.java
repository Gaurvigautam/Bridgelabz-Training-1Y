import java.util.*;
public class AverageofThreeNumbers{
  public static void main(String[] args){
  Scanner sc =  new Scanner(System.in);
  int a= sc.nextInt();
  int b= sc.nextInt();
  int c= sc.nextInt();
  double Average = (a + b + c)/3;
  System.out.println(Average);
  }
}