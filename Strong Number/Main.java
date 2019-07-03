import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int digit;
      int temp=n;
      int sum=0;
      int fact,i;
      while(temp>0)
     {
        fact=1;
        i=1;
         digit=temp % 10;
        while(i<=digit)
        {
          fact=fact*i;
          i++;
        }
         sum=sum + fact;
         temp=temp/10;
       
      }
      if(n==sum)
      {
       	System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
}
}