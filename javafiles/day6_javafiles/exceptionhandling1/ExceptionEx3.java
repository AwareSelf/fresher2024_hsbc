package exceptionhandling1;

import exceptionhandlingex.TryCatchInFunc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx3 {

    public static void main(String[] args) //throws IOException{
    {
     System.out.println("program starts...");
     ExceptionEx3 ob = new ExceptionEx3();
      try {
          ob.meth();
       }
      catch(FileNotFoundException e)
      {
          e.printStackTrace();
      }
     catch(IOException e)
     {
        e.printStackTrace();
     }
      System.out.println("program ends..");
  }

    public void meth() throws IOException
    {

        System.out.println("inside meth method..");

            FileReader fr = new FileReader("abc.java");
            char ch = (char) fr.read();
            System.out.println("output first char from file abc.java:"+ch);
        System.out.println("returning from meth method..");
    }
}
