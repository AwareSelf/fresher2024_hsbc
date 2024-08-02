package exceptionhandling1;

//scenario where fileresource might not get closed
//as we are not putting file.close() inside finally

import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {
        TryWithResource ob = new TryWithResource();
        ob.meth();
    }


    public void meth() {
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
            e.printStackTrace();
        }

        //if condition
        // return;
        if(ch=='p')
            return;

        System.out.println("closing file resoorce fr...");

        System.out.println("end of meth method and returning from meth method..");
    }
}
