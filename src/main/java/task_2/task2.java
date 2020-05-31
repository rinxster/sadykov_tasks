package task_2;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        int[][] twoDimArray;
        int a=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        System.out.println("N equals: " + n);
        int m = in.nextInt();
        System.out.println("M equals: " + m);
        in.close();

        int[][] arr = new int[n][m];

        for (int i=0; i<n; i++ ){
            System.out.println();
            for (int j=0; j<m; j++ ){
                do{
                    a = (int) (Math.random()*100);
                } while (a%2 == 0);
                arr[i][j]=a;
                System.out.print(arr[i][j] + " ");

            }

        }
    }

}
