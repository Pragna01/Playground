import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int rem;
      int sum=0;
      int count=0;
      int num=n, p=n;
      
      while(num!=0)
      {
        num=num/10;
        count=count+1;
        
      }
     while(p!=0)
     {
         rem=p%10;
         sum=sum+(int) Math.pow(rem,count);
         p=p/10;
         
     }
      if(sum==n)
      {
      	System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}