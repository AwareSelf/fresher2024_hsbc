package exceptionhandling1;

//example to learn the usage of try{} followed by finally{} block
//scenario where fileresource might not get closed
//as we are not putting file.close() inside finally

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class ExceptionFinallyEx5_2 {

    public static void main(String[] args)  {
        ExceptionFinallyEx5_2 ob = new ExceptionFinallyEx5_2();
        try {
            ob.meth();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }


    public void meth() throws IOException{
        FileReader fr=null;
        try {
           fr = new FileReader("C:/hsbc_training_java/batch_2024/corejava_2024batch/corejavabasic/src/exceptionhandling1/abc1.java");
            char ch = (char) fr.read(); //if exception occurs here during reading it will goto main/caller
            System.out.println(ch);
          }
          finally {
            //if file opens and throws exception while reading then it will
            //ensure that finally block executes before propagating exception to it's caller
            //that way we can make sure that file close operation gets executed
            System.out.println("inside finally block of try-finally");
            if(fr!=null)
               fr.close();
        }

     }
}
