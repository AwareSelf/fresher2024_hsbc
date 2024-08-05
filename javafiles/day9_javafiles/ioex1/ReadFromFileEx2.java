package ioex1;

import java.io.*;

/*
Reading from a file in character format
 */

public class ReadFromFileEx2 {

    public static void main(String[] args) {

        String filepath = "C:/hsbc_training_java/batch_2024/" +
                "/corejava_2024batch/corejavabasic/src/classesobjects/Emp.java";
        File sourcefile = new File(filepath);


        String destfilepath= "C:/hsbc_training_java/batch_2024/" +
                "/corejava_2024batch/corejavabasic/src/ioex1/Empx.java";
        File destfile = new File(destfilepath);

        if(sourcefile.exists()) {
            try (FileReader fr = new FileReader(sourcefile);
                 FileWriter fw = new FileWriter(destfile);) {
                int ch;
                while ((ch = fr.read()) != -1) {
                    System.out.print((char) ch);
                    fw.write(ch);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("source file:"+sourcefile.getName()+"does not exists!");
        }
    }
}
