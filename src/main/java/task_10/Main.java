package task_10;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws MyOwnException {
        boolean finish = false;
        System.out.println("Enter word start starts with A:");
        Scanner in = new Scanner(System.in);

        while (finish == false){

            String string = in.nextLine();

            try {
                if (!string.startsWith("A")) {

                    throw new MyOwnException("incorrect!!!Try again. Please enter the word that start with A letter!");
                }
                else {
                    finish = true;
                    System.out.println("Thanks! Your word is: " + string);
                    System.out.println("Good bye!");
                }
            }
            catch (MyOwnException ex){
                System.err.println(ex.getMessage());
            }






        }

        in.close();

    }
}
