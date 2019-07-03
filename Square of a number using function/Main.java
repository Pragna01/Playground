import java.util.Scanner;
class Main
{
  	public static int squre(int n)
    {
      int s=0;
      s=n*n;
      return s;
    }
	public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
      	int s=squre(n);
      	System.out.println(s);
	} 
}