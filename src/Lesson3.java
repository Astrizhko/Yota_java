import java.util.Arrays;

/**
 * Created by Strizhko on 17.10.2016.
 */
public class Lesson3 {
    public static void main(String[] args) {
/*
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
*/
        /*
            int sum = 0;
            for (int x : a)
                System.out.print(x);
            sum += x;
        System.out.print("sum =" + sum);
    }
    */
        /*
int[][] a = {{1,2,3,4,5}, {6,7,8,9,10}};
        for (int [] x : a) {
            for (int i:x) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
        */
        /*
        int[][] a =  new int[3][5];
        int sum = 0;
        int nums[][] = new int[3][5];
        for (int i = 0; i<3; i++)
            for(int j=0; j<5; j++)
                a[i][j]=(i+1)*(j+1);
        System.out.println(Arrays.deepToString(a));
        for (int[]x:a){
            for (int i:x) {
                sum+=i;
            }
            System.out.println("sum = "+sum);
            }




            */
/*
        for (int i = 0; i<10; i++) {
            if (i%2==0)continue;
            System.out.println(i);
        }
        */
        String a ="dfgdfgdfgdfgdfg";
        System.out.println(new String ("sfdfdsf").equals(a));
    }

}
