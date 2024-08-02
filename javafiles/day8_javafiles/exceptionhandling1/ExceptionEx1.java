package exceptionhandling1;

public class ExceptionEx1 {
/* NullPointerException comes under category of UncChecked exception
   so compiler will not force/mandate you to handle or declare the exception
   It excepts you to just correct the code so that exception will never arise in future
 */
    public static void main(String[] args) {
        System.out.println("program starts...");
        meth();
        System.out.println("program ends..");
    }

    public static void meth()
    {
        String s = null;
        //if you put a if condition null-check exception will never arise
        //so no point in writing a try-catch block
        s.toUpperCase();
        System.out.println("to upper case:"+s);
    }
}
