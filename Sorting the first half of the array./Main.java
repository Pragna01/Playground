import java.util.Scanner;
class Main
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i =0; i< n; i++)
  {
    arr[i] = sc.nextInt();
  }
  int li=0;
  int hi = n;
  int mi =(li+hi)/2;
  int temp;
  for(int i =li; i< mi; i++)
  {
    
      for(int j =li; j< mi-1; j++)
      {
        if(arr[j] >arr[j+1])
        {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          
        }
      }
  }
    for(int i =0; i< n; i++)
    {
      System.out.print(arr[i] +" ");
    }
}
}
