import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      	int n1=in.nextInt();
      	int output=(n1/10)%10;
      	System.out.println(output);
	}
}