import java.util.Scanner;
class Main
{
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
    	int x=0;
		for(int i =1; i <= n; i++) {
			for(int j=1; j <= i ; j++){
				if(x == 0)
                {
					System.out.print("*");
              		x=1;
                }
				else
                {
            		System.out.print("#");
                  	x=0;
                }
            }
    			System.out.print("\n");
        }
    		
        
	}
}
    
