package ioex1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Reading from a file in character format
 */

public class ReadFromFileEx {

    public static void main(String[] args) {

        String filepath = "C:/hsbc_training_java/batch_2024/" +
                "/corejava_2024batch/corejavabasic/src/classesobjects/Emp.java";

        String destfilepath= "C:/hsbc_training_java/batch_2024/" +
                "/corejava_2024batch/corejavabasic/src/ioex1/Empx.java";

        try(FileReader fr = new FileReader(filepath);
            FileWriter fw = new FileWriter(destfilepath);) {
           int ch ;
            while((ch = fr.read())!=-1)
            {
                System.out.print((char)ch);
                fw.write(ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
