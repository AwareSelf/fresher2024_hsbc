package miscellaneous;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesWriteString {
    // Implementation of writeString() method in Java


        public static void main(String[] args)
        {
            // Initializing file Path with some conditions
            // creating path
            Path filePath
                    = Paths.get("C:/hsbc_training_java/batch_2024/" +
                    "/corejava_2024batch/corejavabasic/src/classesobjects/","Emp.java");

            try {

                String str = "/* Hello from Namrata !! */";
                // Write content to file
                Files.writeString(filePath,str,StandardOpenOption.APPEND);

                // Verify file content
                String content = Files.readString(filePath);

                System.out.println(content);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
     }


}
