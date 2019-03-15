import java.util.Scanner;
class Main{
  
  static int gcd(int i,int j)
  {
  if(j==0)
    return i;
  else 
    return gcd(j,i%j);
  }
	public static void main (String[] args){
	    // Type your code here
      
      Scanner sc =new Scanner(System.in);
      int i=sc.nextInt();
      int j=sc.nextInt();
      int k=sc.nextInt();
      int z = (gcd(i,j));
     int x=(gcd(z,k));
      System.out.println(x);
     // else
      //  System.out.println(k);
	}
}