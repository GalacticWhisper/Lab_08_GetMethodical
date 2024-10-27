import java.util.Scanner;
public class getInt
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int userInt;
        String trash = "";
        boolean done = false;
        userInt = SafeInput.getInt(in, "Enter any integer");
        do {
            System.out.println("\nYour integer is: " + userInt);
            if (in.hasNextInt()) {
                userInt = in.nextInt();
                in.nextLine();
                System.out.println("Your integer is " + userInt);
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is invalid. Enter an integer");
            }
        } while (!done);
    }
}



