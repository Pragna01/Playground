import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
	
        int num = scan.nextInt();
        
    int n1 =(num/100);
    int n2=(num/10)%10;
    int n3=(num%10);
    int reverse=(n3*100)+(n2*10)+n1;
    System.out.println(reverse);
  }
}