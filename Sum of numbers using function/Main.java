import java.util.Scanner;
class Main{
  
  static int sum(int n)
  { int s=0;
    //int j;
    if(n==1)
    {
      return 1;
    }
    
    {
      s=s+n;
   int  j=s+sum(n-1);
     //  n--;
    return j;
     
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc =new Scanner(System.in);
      int n= sc.nextInt();
      System.out.println(sum(n));
    }
}