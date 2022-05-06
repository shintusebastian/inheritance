import java.util.Locale;

public class ExceptionDemo {//Exceptions are handled using try and catch
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("1234u"));
        try{ int [] arr=new int[3];
            System.out.println(arr[8]);
            //susceptible code(the code which can cause exception) is written here
            System.out.println(2/0);
        }
        catch(ArithmeticException e){
            System.out.println("Sorry. Wrong input , can't divide by 0");
        }
        catch(NumberFormatException e){
            System.out.println("Sorry, the format is different");
        }
        catch(Exception e){    //the catch will catch the ball of exception.
        /*e is the exception object. e is able to catch any type of exception.
        Exception is the parent class and e is an object of child class. So, this is an example of loose coupling.
          Inside the curly braces we handle the exception. Either to log it into a file for future reference,
          or give a message to user, etc. */

            e.printStackTrace();// the whole stack trace will get printed here.
            /*it says in which class, which line, what type of exception occurred, and the error message.*/
            System.out.println(e.getMessage());// this gives all information about the exception object.

        }
        finally{

        }

Shape shape=new Rectangle();
        ((Circle)shape).draw();//we can see the methods as we have casted. But the real object is a Rectangle.
        String name="Shintu";
        System.out.println(name.toUpperCase(Locale.ROOT));//Null Pointer Exception. It's a very common exception.

//        int [] arr=new int[3];
//        System.out.println(arr[8]);//array index out of bound exception
//        System.out.println(2/0);//arithmetic exception
    }
}
