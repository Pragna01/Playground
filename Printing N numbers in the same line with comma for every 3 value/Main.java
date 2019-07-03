import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=3;
    int i;
    for(i=1;i<=n;i++)
    {
      System.out.print(i);
    if((i % m == 0) && (i != n))
    			System.out.print(",");		
    }
  }
}