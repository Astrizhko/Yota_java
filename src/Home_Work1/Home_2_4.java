package Home_Work1; /**
 * Created by Strizhko on 17.10.2016.
 */
import java.util.Scanner;
public class Home_2_4 {
    public static void main(String[] args) {
        String P = "pass";
        Scanner in = new Scanner(System.in);
        System.out.println("введите пароль: ");
        String pass = in.nextLine();
        if ((pass).equals(P))
        System.out.println("Welcome");
        else
            System.out.println("Неверный пароль");

    }
}
