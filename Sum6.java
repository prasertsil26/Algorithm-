import java.util.Scanner;
public class Sum6 { //หลัง class = ชื่อไฟล์//
     public static void main (String[]args){ //ตรงนี้จะขึ้นเสมอถ้าใช้นามสกุลไฟล์ถูก//
      Scanner scanner = new Scanner(System.in);//Scanner เอาไว้ใช้ก็ต่อเมื่อต้องการพิมพ์//
      // Triangle
      System.out.print("Enter you base of the triangle\n");
      int base = scanner.nextInt(); //scanner.nextInt() = เอาไว้เก็บข้อมูลแปลงเป็นตัวแปร//
      System.out.print("Enter you height of the triangle\n");
      int height = scanner.nextInt();
      double Triangle = 0.5*(base*height);
      System.out.println("Base = " + base);
      System.out.println("Height = " + height);
      System.out.println("Area of Triangle = " +Triangle+ " unit");
      // Square
      System.out.print("Enter the length of the rectangle\n");
      int length = scanner.nextInt();
      System.out.print("Enter the width of the rectangle\n");
      int width = scanner.nextInt();
      int Square = length*width;
      System.out.println("length = " + length);
      System.out.println("width = " + width);
      System.out.println("Area of Rectangle = " +Square+ " unit");

    }
}