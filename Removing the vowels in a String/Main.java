import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str_vol = new String("aeiouAEIOU");
    StringBuilder sb1= new StringBuilder(str);
    StringBuilder sb2 = new StringBuilder();
    int str_len = sb1.length();
    int str_vol_len = str_vol.length();
    for(int i = 0; i < str_len; i++)
    {
      for(int j = 0; j < str_vol_len; j++)
      {
      		if(sb1.charAt(i) == str_vol.charAt(j))
            {
              sb1.setCharAt(i, '$');
            }
      }
    }
    for(int i = 0; i < str_len; i++)
    {
      if(sb1.charAt(i) != '$')
      {
        sb2.append(sb1.charAt(i));
      }
    }
    System.out.print(sb2);
  }
}