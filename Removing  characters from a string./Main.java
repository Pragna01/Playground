import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  String str1 = sc.nextLine();
  String str2 = sc.nextLine();
  StringBuilder sb1 = new StringBuilder(str1);
  StringBuilder sb2 = new StringBuilder(str2);
  StringBuilder sb3 = new StringBuilder();
  int str1_length = sb1.length();
  int str2_length = sb2.length();
  
  for(int i = 0 ; i < str1_length ; i++)
  {
     for(int j = 0 ; j < str2_length ; j++)
    {
       if(sb1.charAt(i) == sb2.charAt(j))
      {
         sb1.setCharAt(i, '$');
         //sb2.setCharAt(j, '$');
         break;
      }
    }
  }
  //int count=0;
  for(int i = 0 ; i < str1_length ; i++)
  {
    if(sb1.charAt(i) != '$')
    {
      sb3.append(sb1.charAt(i));
    }
  }
  
  System.out.print(sb3);
}
}