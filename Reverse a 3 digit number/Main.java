import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int a,b,c,d,e;
    Scanner sc=new Scanner (System.in);
    a=sc.nextInt();
    b=a%10;
    c=a/100;
    d=a/10%10;
    e=(b*100)+(d*10)+(c);
    System.out.println(e);
  }
}