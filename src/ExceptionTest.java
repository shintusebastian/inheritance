import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args)/* throws NotEligibleException*/ {// this is the lazy way of handling exceptions.
        ExceptionTest test=new ExceptionTest();
        try {
            test.testEligibility();// this method will show error because it warns the caller that this method may throw an exception.
        } catch (NotEligibleException e) {

        }
        /*either line 6 can do the exception handling or pass it to the above called method which is the psvm.
        * the psvm can also pass the exception handling to the method which called psvm and it is the JVM
        * this will result in serious troubles and the program may crash. this is the lazy way of handling exception */

//        try {
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if (b == 0) {
//                throw new ArithmeticException();// here we throw an exception before we know it before hand.
//                //this means, create a new object of arithmetic exception and throw it.
//                //note: only exceptions are throwable.
//                // we can use predefined exceptions. but if needed, we can create our own exceptions.
//            }
//
//        } catch (Exception e) {
//        }
//

    }

    public void testEligibility() throws NotEligibleException {//label throws is added here
        /* Remember:  we have to mark a label here that this method is throwing an exception.
        * The compiler is able to see this exception because it is not a run time exception. if it was
        * extended as a runtime exception, then we don't want to use the label throws*/
        int age = 13;
        int weight = 55;
        if (age > 25 && weight > 45) {
            System.out.println("Eligible for blood donation");
        } else
            throw new NotEligibleException("Not eligible for blood donation");// this is a good practice as it does not
        //provide exception handling using try catch inside it's body.
    }
    class  NotEligibleException extends Exception{
        public NotEligibleException(String message) {
            super(message);
        }
    }
}



