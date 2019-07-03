import java.util.Scanner;
public class Main {
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
   
    int cnt = in.nextInt();
    String str3 = str1.replace(str1, str2);
   
     String arr[] = str3.split(" ",cnt);
     for(int index = 0; index < arr.length; index++)
       {
           String res = arr[index];
           System.out.println(res);
       }
    }
  }