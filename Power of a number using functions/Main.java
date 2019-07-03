import java.util.Scanner;
class Main{
  	public static int pow(int n,int m)
    {
      int power=(int) Math.pow(n,m);
      return power;
    }
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int m= in.nextInt();
	    int power=pow(n,m);
      System.out.print(power);
	}
}