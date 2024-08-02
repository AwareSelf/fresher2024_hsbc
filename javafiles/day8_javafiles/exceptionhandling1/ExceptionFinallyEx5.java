package exceptionhandling1;

//scenario where fileresource might not get closed
//as we are not putting file.close() inside finally

import java.io.FileReader;
import java.io.IOException;

public class ExceptionFinallyEx5 {

    public static void main(String[] args) {
        ExceptionFinallyEx5 ob = new ExceptionFinallyEx5();
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
            //if condition
            // return;
            if (ch == 'p') {
                System.out.println("returning from meth method..");
                return;
            }

        }
        catch(IOException e)
        {
          e.printStackTrace();
        }
        finally {
            System.out.println("closing file resoorce fr...");
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("at the end of finally block...");
        } //end of finally
        System.out.println("end of meth method and returning from meth method..");
    }
}
