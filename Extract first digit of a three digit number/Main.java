import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      	int n1=in.nextInt();
      	int first_digit=n1/100;
      	System.out.println(first_digit);
	}
}