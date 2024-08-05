package exceptionhandling1;


//program to learn the concept of throw clause

import java.io.FileReader;
import java.io.IOException;

public class ThrowClauseEx {

    public static void main(String[] args) {
        ThrowClauseEx ob = new  ThrowClauseEx();
        try {
            ob.meth();
        }
        catch(IOException e)
        {
            System.out.println("handling the rethrown exception here in its caller...");
            e.printStackTrace();

        }
    }


    public void meth() throws IOException {
        char ch = 'x';
        //try-with-resource clause
        try(FileReader fr =
                    new FileReader("C:/hsbc_training_java/batch_2024/corejava_2024batch/corejavabasic/src/exceptionhandling1/abc.java");
            FileReader fr1 = new FileReader("def.java");
        )
        {
            System.out.println("inside meth method..");


            ch = (char) fr.read();
            System.out.println("output first char from file abc.java:"+ch);
            System.out.println("returning from meth method..");

        }
        catch(IOException e)
        {
            //partially handle the exception
            System.out.println(e);
            throw e; //rethrow the same exception so as to handle remaining exception in caller

        }

        //if condition
        // return;
        if(ch=='p')
            return;

        System.out.println("closing file resoorce fr...");

        System.out.println("end of meth method and returning from meth method..");
    }
}
