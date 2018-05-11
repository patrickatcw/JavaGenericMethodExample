package com.me;

//importing method
import static com.me.Test.genericDisplay;

/*can also write generic functions that can be called with
different types of arguments based on the type of arguments
passed to generic method, the compiler handles each method

https://www.geeksforgeeks.org/generics-in-java/

https://docs.oracle.com/javase/tutorial/java/generics/why.html
 */
public class Main {

    public static void main(String[] args) {

        // Calling generic method with Integer argument
        genericDisplay(33);

        // Calling generic method with String argument
        genericDisplay("Generics Method Example");

        // Calling generic method with double argument
        genericDisplay(5.6);

        /*results;
            java.lang.Integer = 33
            java.lang.String = Generics Method Example
            java.lang.Double = 5.6
         */

    }

}
