package inputoutputStreams;

import java.io.FileReader;

public class FileReaderDemo2 {

    public static void main(String[] args) throws Exception {

        try (FileReader fr = new FileReader("F:/Java-Lang-Learning_Sep2025/Test2.txt")) {

            int x;

            while ((x = fr.read()) != -1) {
                System.out.print((char) x);
            }
        }
    }
}
