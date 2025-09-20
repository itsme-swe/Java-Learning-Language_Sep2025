/*
 * In this practice session, we first create a two new file and insert some data into it. Then, we read from those files and copy its contents into another file, but the order to in sequential manner.
 * */

package inputoutputStreams;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PracticeDemo2 {

    public static void main(String[] args) throws Exception {

        Path file1 = Paths.get("F:/Java-Lang-Learning_Sep2025/Demo.txt");
        Path file2 = Paths.get("F:/Java-Lang-Learning_Sep2025/Demo2");
        Path merged = Paths.get("F:/Java-Lang-Learning_Sep2025/Compiled.txt");

        // Step 1: Write dummy data into File1 and File2
        Files.writeString(file1, "I am data from file1 and here we are using Java NIO for IO operations.\n", StandardCharsets.UTF_8);
        Files.writeString(file2, "I am data from file2 and we are trying new IO operations API.");

        // Step 2: Read contents of both files
        String content1 = Files.readString(file1, StandardCharsets.UTF_8);
        String content2 = Files.readString(file2, StandardCharsets.UTF_8);

        // Step 3: Merge into new file
        Files.writeString(merged, content1 + content2, StandardCharsets.UTF_8);

        System.out.println("Data Merged into " + merged);
    }
}

/*
 * Here we have used advance Java I/O API which is JAVA NIO.
 * */
