package miscellaneous;

// Implementation for readString() method in Java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FilesReadString {
    public static void main(String[] args) {

        // creating path
        Path filePath
                = Paths.get("C:/hsbc_training_java/batch_2024/" +
        "/corejava_2024batch/corejavabasic/src/classesobjects/","Emp.java");

        try
        {
            // reading file from given path
            String content = Files.readString(filePath);
            // printing the content
            System.out.println(content);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
