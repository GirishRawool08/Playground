import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int a,b;
      Scanner sc =new Scanner (System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      
      if(a>b)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}