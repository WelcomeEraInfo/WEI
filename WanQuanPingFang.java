import java.util.Scanner;

public class WanQuanPingFang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(a+b)²=c");
        System.out.print("a=");
        double a = scanner.nextDouble();
        System.out.print("b=");
        double b = scanner.nextDouble();
        double c = a * a + 2 * a * b + b * b;
        System.out.println("c" + "=" + "(" + a + "+" + b + ")" + "²" + "=" + c);
    }
}
