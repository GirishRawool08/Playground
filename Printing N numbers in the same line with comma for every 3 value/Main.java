import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc =new Scanner (System.in);
    int i =sc.nextInt();
    for(int j=1;j<=i;j++)
    {
    System.out.print(j);
      if(j%3==0)
      {
      System.out.print(",");
      }
    }
  }
}