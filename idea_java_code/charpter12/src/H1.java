import java.util.Scanner;

/**
 * @author 曹宁
 * @version 1.0
 * 如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止
 */
public class H1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input=scanner.next();
            try {
                System.out.println(Integer.parseInt(input));
                break;
            } catch (NumberFormatException e) {
                System.out.println("请重新输入");
            }
        }
    }
}
