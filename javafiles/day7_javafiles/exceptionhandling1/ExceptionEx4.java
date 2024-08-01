package exceptionhandling1;

//scenario where fileresource might not get closed
//as we are not putting file.close() inside finally

import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx4 {

    public static void main(String[] args) {
        ExceptionEx4 ob = new ExceptionEx4();
        ob.meth();
    }


    public void meth() {
        FileReader fr=null;
        char ch = 'x';
        try
        {
            System.out.println("inside meth method..");

           fr = new FileReader("C:/hsbc_training_java/batch_2024/corejava_2024batch/corejavabasic/src/exceptionhandling1/abc.java");
            ch = (char) fr.read();
            System.out.println("output first char from file abc.java:"+ch);
            System.out.println("returning from meth method..");

        }
        catch(IOException e)
        {
          e.printStackTrace();
        }

        //if condition
        // return;
         if(ch=='p')
             return;

        System.out.println("closing file resoorce fr...");
        try {

   //this resource not get closed as fr.close() is not executed soln put below code in finally
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("end of meth method and returning from meth method..");
    }
}
