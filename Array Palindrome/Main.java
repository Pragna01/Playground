import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
    int arr1[] = new int[n];
    int arr2[] = new int[n];
      int i;
    for( i = 0;i < n;i++)
    {
      arr1[i] = in.nextInt();
    }
    int temp = n;
    for( i = 0;i < n;i++)
    {
      arr2[temp -1] = arr1[i];
      temp = temp -1;
    }
    if (Arrays.equals(arr1, arr2))
  {
    System.out.print("Yes");
  }
  else
  {
    System.out.print("No");
  }
    }
  
}