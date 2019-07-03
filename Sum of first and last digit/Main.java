import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first;
      int last = n % 10;
      int sum;
      while(n>=10)
      {
        n = n/10;
      }
      first=n;
      sum = first+last;
      System.out.println(sum);
	}
}