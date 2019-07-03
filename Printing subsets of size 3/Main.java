import java.util.Scanner;
class Main{
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      //int value=sc.nextInt();
      //int sum=0;
      for(int index1=0;index1<=n-2;index1++)
      {
        //int temp=arr[index1];
        for(int index2 = index1+1;index2 < n;index2++)
        {
          for(int index3 = index2+1;index3 < n;index3++)
          {
             System.out.print("(" + arr[index1] +"," + " "+ arr[index2] + ", " + arr[index3] + ") ");
          }
        }
        System.out.print("\n");
      }
    }
}