import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        System.out.println("开始记录 | Start recording (输入ok保存 | Enter ok to save):");
        Scanner input = new Scanner(System.in);
        StringBuilder md = new StringBuilder();
        while (true) {
            String n = input.nextLine();
            if ("ok".equals(n)) {
                break;
            } else {
                md.append(n).append(System.lineSeparator());
            }
        }
        String filename = "Text.md";
        try (FileWriter todo = new FileWriter(filename,true)) {
            todo.write(md.toString());
            System.out.println("成功记录在本目录 | The success is recorded in this directory");
        } catch (IOException e) {
            System.out.println("记录异常失败！| Record exception failed !");
        }
    }
}
