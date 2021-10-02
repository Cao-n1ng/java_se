import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * @author 曹宁
 * @version 1.0
 */
public class H2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        String input;
        try {
            input = scanner.next();
            n1 = Integer.parseInt(input);
            input = scanner.next();
            n2 = Integer.parseInt(input);
            System.out.println(cal(n1, n2));
        } catch (NumberFormatException e) {
            System.out.println("输入格式错误");
        }
    }

    static int cal(int n1, int n2) {
        try {
            return n1 / n2;
        } catch (Exception e) {
            System.out.println("除0错误");
            return -1;
        }
    }
}
