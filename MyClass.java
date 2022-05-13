import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
  System.out.println("Enter the Number: ");
  int num=in.nextInt();
  int va=num;
  int dgt1,dgt2,dgt3;
  
  dgt1=va%10;
  va=va/10;
  
  dgt2=va%10;
  va=va/10;
  
  dgt3=va%10;
  
  int sum=((dgt1*dgt1*dgt1)+(dgt2*dgt2*dgt2)+(dgt3*dgt3*dgt3));
  
  if (sum==num)
  {
      System.out.println(num+" is amstrong");
  }
  else
  {
      System.out.println(num+"is not amstrong");
  }
  
  
  
  
  
    }
    
}