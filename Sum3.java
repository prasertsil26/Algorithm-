import java.util.Scanner;
public class Sum3 { //หลัง class คือชื่อไฟล์ 
    public static void main( String[]arg ){ // ตรงนี้จะขึ้นเสมอถ้าใช้นามสกุลไฟล์ถูกต้อง //
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please Enter Num1 : ");// System.out.println คือตัวที่ปริ้นออกมา //
      double num1 = scanner.nextDouble();
     
      System.out.println("Please Enter Num1 : ");
      double num2 = scanner.nextDouble();
      
      System.out.println("Please Enter Num1 : ");
      double num3 = scanner.nextDouble();
      
      System.out.println("Please Enter Num1 : ");
      double num4 = scanner.nextDouble();
      
      System.out.println("Please Enter Num1 : ");
      double num5 = scanner.nextDouble();
      
      double sum = num1 + num2 + num3 + num4 + num5;
      double average = sum/5;

      System.out.println("Summary = " + sum);
      System.out.println("Average = " + average);

      scanner.close();
    

    }
}
// javac ตามด้วยชื่อไฟล์ //
// java ตามด้วย sum //