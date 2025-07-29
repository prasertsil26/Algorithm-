import java.util.Scanner;
public class Sum4 { //หลัง class = ชื่อไฟล์//
     public static void main (String[]args){ //ตรงนี้จะขึ้นเสมอถ้าใช้นามสกุลไฟล์ถูก//
      Scanner scanner = new Scanner(System.in);//Scanner ตัวนี้จะใช้ก็ต่อเมื่อต้องการพิมพ์//
      System.out.print("Enter your money per month\n");
      int money = scanner.nextInt(); //scanner.nextInt() = เอาไว้เก็บข้อมูลแปลงเป็นตัวแปร//
      double sum = money*(10.0/100);
      System.out.println("You pay tax = "+sum+" baht");
    }
}
