import java.util.Scanner;

public class WanQuanPingFang {
    public static void main(String[] args) {
        System.out.println("(a+b)²=c");
        System.out.print("a=");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("b=");
        double b = scanner.nextDouble();
        double c = a * a + 2 * a * b + b * b;
        System.out.println("c" + "=" + "(" + a + "+" + b + ")" + "²" + "=" + c);
    }
}
