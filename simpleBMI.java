import java.util.Scanner;
public class BMI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入体重(单位千克):");
    double kg = scanner.nextDouble();
    System.out.println("请输入身高(单位厘米):");
    double cm = scanner.nextDouble();
    double m = cm / 100;
    double tizhi = kg / (m * m);
    int tizhi2 = (int)tizhi;
    System.out.println("BMI计算结果:"+tizhi2);
    System.out.println("正常值范围:18.5～24.5");
  }
}