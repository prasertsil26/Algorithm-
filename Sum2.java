import java.util.Scanner;
public class Sum2 { //หลัง class คือชื่อไฟล์ 
    public static void main( String[]arg ){ // ตรงนี้จะขึ้นเสมอถ้าใช้นามสกุลไฟล์ถูกต้อง //
      Scanner scanner = new Scanner(System.in);

      System.out.println("Emter you number1 : ");
      int num1  = scanner.nextInt();
      System.out.println("Emter you number2 : "); // System.out.println คือตัวที่ปริ้นออกมา //
      int num2  = scanner.nextInt();
      int sum = num1 + num2 ; 
      System.out.println("sum = " + sum );

    }
}
// javac ตามด้วยชื่อไฟล์ //
// java ตามด้วย sum //