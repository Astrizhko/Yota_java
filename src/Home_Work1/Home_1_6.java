package Home_Work1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Home_1_6 {
    public static void main(String[] args) {
        //  int m[];
        Scanner in = new Scanner(System.in);
        System.out.println("ведите 10 чисел: ");
        String[] str = in.nextLine().split(" ");
        System.out.println(Arrays.toString(str));  // выводим четные и нечетные числа, те все числа.
        int numArr[] = new int[str.length];  //перепиливаем в масив интов
        for (int i = 0; i < str.length; i++) {
            numArr[i] = Integer.parseInt(str[i]);
            System.out.println(numArr[i]);  //выводим масив интов ?
        }
        System.out.println("Задание 6.2");
        int max = numArr[0], min = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (max < numArr[i])
                max = numArr[i];
            if (min > numArr[i])
                min = numArr[i];
        }
        System.out.println("MAx_value = " + max);  //максимальное число из массива
        System.out.println("MIn_value = " + min);  //минимальное число из массива

        System.out.println("задание 6.3");
        for (int j = 0; j < numArr.length; j++) {
           if  ((numArr[j]%3==0)|(numArr[j]%9==0))System.out.println(numArr[j] + "  " + " делится на 3 или на 9 ");  //числа которые делятся на 3 или на 9
          else System.out.println(numArr[j] + "  " + " не делится на 3 или на 9 без остатка");
        }
        System.out.println("Задание 6.4");

        for (int j = 0; j < numArr.length; j++) {
            if  ((numArr[j]%5==0)&(numArr[j]%7==0))System.out.println(numArr[j] + "  " + " делится на 5 и на 7 ");  //числа которые делятся на 5 и на 7
            else System.out.println(numArr[j] + "  " + "Не делится на 5 и 7");
        }
        System.out.println("Задание 6.5 Все трехзначные числа, в десятичной записи которых нет одинаковых цифр");

        for (int x = 0; x < numArr.length; x++) {
            if  (((numArr[x]>=100)&(numArr[x]<=999))&(numArr.toString().charAt(0) != numArr.toString().charAt(1) && numArr.toString().charAt(0) != numArr.toString().charAt(2) && numArr.toString().charAt(1) != numArr.toString().charAt(2)
                    ))System.out.println(numArr[x] + "  " + " трехзначное нет одинаковых цифр ");  //Все трехзначные числа, в десятичной записи которых нет одинаковых цифр

            else System.out.println(numArr[x] + "  " + "Не трехзначное или одинаковые цифры");
        }
        System.out.println("Задание 6.6");


    }
}
