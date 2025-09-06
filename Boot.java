import java.util.Scanner;

public class Boot {
    public static void main(String[] args) {
        System.out.printf("请选择运行项 | Please select a run item:" + "%n%n");
        System.out.printf("1.BMI" + "%n" + "2.WanQuanPingFang" + "%n%n");
        System.out.print("输入数字选择 | Input digit selection:");
        Scanner scanner = new Scanner(System.in);
        int run = scanner.nextInt();
        System.out.printf("%n" + "开始运行 | Start running:" + "%n%n");
        switch (run) {
            case 1:
                BMI.main(args);
                break;
            case 2:
                WanQuanPingFang.main(args);
                break;
            default:
                System.out.println("已退出 | Exited");
        }
    }
}
