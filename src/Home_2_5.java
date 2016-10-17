/**
 * Created by Strizhko on 17.10.2016.
 */
public class Home_2_5 {
    public static void main(String[] args) {
        int s = 0, p = 1;
        for (int i = 0; i < args.length; i++) {
            int ss = Integer.parseInt(args[i]);
            s += ss;
            p *= ss;
           // System.out.println(args[i]); наш ссаный масив
        }
        System.out.println("summ = " + s);
        System.out.println("proizv = " + p);


    }
}
