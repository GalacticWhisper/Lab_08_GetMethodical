import java.util.Scanner;
public class SafeInput
{
    /** Method 1: getNonZeroLenString
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. The loop will run until it isn't.
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }
    /** Method 2: getInt
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static int getInt(Scanner pipe, String prompt) {
        int userInt = 0; // This is the integer that the user enters.


        return userInt;
    }


}
