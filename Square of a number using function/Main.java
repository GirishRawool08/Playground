import java.util.Scanner;
class Main
{
  static int square(int n)
  {
  int k=n*n;
    return k; 
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
      System.out.println(square(n));
	} 
}