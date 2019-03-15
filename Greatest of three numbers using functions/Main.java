import java.util.Scanner;
class Main{
  
  static int Great(int i,int j)
  {
  if(i>j)
    return i;
    
    else 
      return j;
  
  }
	public static void main (String[] args){
	    // Type your code here
      
      Scanner sc =new Scanner(System.in);
      int i=sc.nextInt();
      int j=sc.nextInt();
      int k=sc.nextInt();
      int z = (Great(i,j));
      if (z>k)
      System.out.println(z);
      else
        System.out.println(k);
	}
}