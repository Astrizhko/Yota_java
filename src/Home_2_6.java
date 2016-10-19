import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Home_2_6 {
    public static void main(String[] args ) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("ведите 10 чисел: ");
        String n = in.nextLine().trim();
        char[] charArray = n.toCharArray();
        System.out.println(charArray);

        int[] num = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            num[i] = Character.digit(charArray[i], 10);
        }
        System.out.println(Arrays.toString(num));
    }
}
