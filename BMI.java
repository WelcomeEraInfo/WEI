import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.print("请输入体重 | Please enter your weight (单位千克 | Unit kg):");
        Scanner scanner = new Scanner(System.in);
        double kg = scanner.nextDouble();
        System.out.print("请输入身高 | Please enter your height (单位厘米 | Unit cm):");
        double cm = scanner.nextDouble();
        double m = cm / 100;
        double tizhi = kg / (m * m);
        System.out.println("结果 | Result:"+tizhi);
        System.out.println("正常值范围 | Normal value range:18.5～24.5");
        if (tizhi <= 24.5 && tizhi >= 18.5) {
            System.out.println("判断为正常 | Judged as normal");
        } else {
            System.out.println("判断为不正常 | Judged as abnormal");
        }
    }
}
