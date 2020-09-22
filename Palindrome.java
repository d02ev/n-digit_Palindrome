// checks the palindrome property of a n-digit number

import java.util.Scanner;
import java.lang.String;

public class Palindrome {

    public static void main(String[] args) {

        // extra variables
        String numStr = " ";
        String revStr = " ";

        // object declaration
        Scanner userInput = new Scanner(System.in);

        // prompt for input
        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        // conversion from integer to string
        numStr = Integer.toString(number);

        // now the value stored in the revStrObj will be our number
        StringBuffer revStrObj = new StringBuffer(numStr);

        // reversing the string
        revStrObj = revStrObj.reverse();

        // converting StringBuffer class object into string
        revStr = revStrObj.toString();

        if (numStr.equals(revStr)) {

            System.out.println(number + " is a PALINDROME");

        } else {

            System.out.println(number + " is not a PALINDROME");
        }

        userInput.close();

    }

}
