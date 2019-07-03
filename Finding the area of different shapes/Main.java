import java.util.Scanner;
public class Main {
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     int op=s.nextInt();

   switch(op)
   {
       case 1:
                int side = s.nextInt();
                int area_square = side * side;
                System.out.println(area_square);
                break;
            case 2:
                int length = s.nextInt();
                int breadth = s.nextInt();
                int area_rec = length * breadth;
                System.out.println(area_rec);
                break;
            case 3:
                int heigth = s.nextInt();
                int base = s.nextInt();
                int area_tri = (heigth * base) / 2;
                System.out.println(area_tri);
                break;
            case 4:
                int radius = s.nextInt();
                double area_cir = 3.14 * radius * radius;
                System.out.println(area_cir);
                break;
        }
     }
  }