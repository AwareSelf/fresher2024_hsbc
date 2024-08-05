package ioex1;

import ioex.FileInputStreamEx;

import java.io.*;

/*
Reading from a file in character format
 */

public class ReadFromFileByteFormatEx {

    public static void main(String[] args) {

        String sourcefilepath = "C:/hsbc_training_java/batch_2024/" +
                "/corejava_2024batch/corejavabasic/src/ioex1/marks.dat";

        String destfilepath= "C:/hsbc_training_java/batch_2024/" +
                "/corejava_2024batch/corejavabasic/src/ioex1/marks1.dat";

        File sourcefile = new File(sourcefilepath);
        File destfile = new File(destfilepath);

        if(sourcefile.exists()) {
            try (FileInputStream fr = new FileInputStream(sourcefile);
                 FileOutputStream fw = new FileOutputStream(destfile);) {
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
            System.out.println("file with filename:"+sourcefile.getName()
                    +" and path:"+sourcefile.getAbsolutePath()+"does not exist");
        }
    }

}
