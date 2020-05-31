package task_4;

import java.util.Scanner;

public class Aletter2 {
    public static void main(String[] args) {
        boolean finish = false;
        System.out.println("Enter word start starts with A:");
        Scanner in = new Scanner(System.in);

        while (finish == false){

            String string = in.nextLine();

            if (!string.startsWith("A")) {
                System.out.println("Try again. Please enter the word that start with A letter");
            }
            else {
                finish = true;
                System.out.println("Thanks! Your word is: " + string);
                System.out.println("Good bye!");
            }

        }

        in.close();

    }

}
