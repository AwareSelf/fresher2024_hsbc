package exceptionhandling1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx2 {

    public static void main(String[] args) {

        System.out.println("program starts...");
        ExceptionEx2 ob = new ExceptionEx2();
        ob.meth();
        System.out.println("program ends..");
    }

    public void meth()
    {

        System.out.println("inside meth method..");
        try {
            FileReader fr = new FileReader("abc.java");
            char ch = (char) fr.read();
            System.out.println("output first char from file abc.java:"+ch);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("inside FileNotFound catch block...");
        }
        catch(IOException e)
        {
         //   e.printStackTrace();
            System.out.println("IO EXception occured:"+e);
            System.out.println("inside IOException catch block...");
        }

        System.out.println("returning from meth method..");
    }
}
