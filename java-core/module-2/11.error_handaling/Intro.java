//                           Throwable
//                               |
//               --------------------------------
//               |                              |
//             Error                        Exception
//               |                              |
//      ------------------                  -----------------------------
//      |                |                  |                           |
// VirtualMachineError  (Other)         RuntimeException        Checked Exceptions
//      |                                       |
// -------------------                         -----------------------------------------
// |                 |                        |        |        |        |            |
// StackOverflowError OutOfMemoryError      ArithmeticException
    //                                    InputMismatchException
    //                                    NullPointerException
    //                                    ClassCastException
    //                                    IndexOutOfBoundsException
    //                                            |
    //                              --------------------------------
    //                              |                              |
    //                   ArrayIndexOutOfBoundsException   StringIndexOutOfBoundsException




// What will happen when a exception occure
// 1. the flow of the program will be stopped
// 2. an exception object will be created which contains:
//    a. Name and description of the exception
//    b. Stack trace (state of the program at the time of the exception)
// 3. jvm search for exception handler and if it is 
//    present it will handel the exception and program continue 
//    after try catch block and if it is not present program get terminated.
//     
// exception handalling machenism
// 1. try catch
// 2. try with multiple catch
// 3. try finally
// 4. try catch finally

// Try:
//      What does it does: it is used to enclose the code which may throw an exception.
//      Why its usefull: it is usefull to handle the exception and prevent the program from termination if somthing goes wrong.
//
// Catch:
//      What does it does: it catches the error that happens in the try block and handles it.
//      Why its usefull: Instead of crashing, your program can show a message or do somthing safe.
//
// Finally:
//      What does it does: it is used to execute the code which is common to both try and catch block.
//      Why its usefull: it is usefull to execute the code which is common to both try and catch block.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Main starts");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter value of a : ");

            int a = scanner.nextInt();
            System.out.println("Enter value of b : ");
            int b = scanner.nextInt();
            int ans = a/b;
            
            System.out.println("Answer is : " + ans);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close();
        }
        System.out.println("Main ends");
    }
}
