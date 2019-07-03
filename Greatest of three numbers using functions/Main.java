import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.print(greatest_number(n1,n2,n3));
	}
  	public static int greatest_number(int n1,int n2,int n3)
    {
      int g=0;
      if(n1>n2&&n1>n3)
      {
        g=n1;
      }
      if(n2>n1&&n2>n3)
      {
        g=n2;
      }
      if(n3>n1&&n3>n2)
      {
        g=n3;
      }
      return g;
    }
}