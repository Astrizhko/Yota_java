package Home_Work1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Home_2_6 {
    public static void main(String[] args) {
        //  int m[];
        Scanner in = new Scanner(System.in);
        System.out.println("ведите 10 чисел: ");
        String[] str = in.nextLine().split(" ");
        System.out.println(Arrays.toString(str));  // выводим четные и нечетные числа, те все числа.
        int numArr[] = new int[str.length];  //перепиливаем в масив интов
        for (int i = 0; i < str.length; i++) {
            numArr[i] = Integer.parseInt(str[i]);
            System.out.println(numArr[i]);
        }
        int max = numArr[0], min = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (max < numArr[i])
                max = numArr[i];
            if (min > numArr[i])
                min = numArr[i];
            System.out.println("MAx_value = " + max);
            System.out.println("MIn_value = " + min);

       /* for (String i : str){
            byte[] a = i.getBytes();
            byte[] b = i.getBytes();
            Arrays.sort(b);
            if (Arrays.equals(a,b)){
                System.out.println(i);
                break;
            }
        }
*/

        }
    }
}
