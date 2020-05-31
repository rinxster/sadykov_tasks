package task_7;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {


        System.out.println("Enter n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        System.out.println(recursive(n));

    }

    static int recursive(int n) {
        if (n == 1) {
            return 1;
        }
        System.out.print(n+" ");
        return recursive(n-1);
    }


}
