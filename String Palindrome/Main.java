import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  StringBuilder sb = new StringBuilder(str);
  
  int str_length = str.length();
  for(int i = str_length-1 ; i >= 0  ; i-- )
  {
    char ch = str.charAt(i);
    for(int j = str_length-1-i ; j < str_length ; j++ )
    {
       sb.setCharAt(j , ch);
      
    }
  }
  String str1 = new String(sb);
  if(str.equals(str1) == true)
  {
  	System.out.print("Yes");
  }
  else
  {
    System.out.print("No");
  }
  
}
}