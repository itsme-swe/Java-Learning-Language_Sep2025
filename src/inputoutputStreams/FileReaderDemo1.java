package inputoutputStreams;

import java.io.FileInputStream;

public class FileReaderDemo1 {

    public static void main(String[] args) throws Exception {


        try (FileInputStream fis = new FileInputStream("F:/Java-Lang-Learning_Sep2025/Test.txt")) {

            byte[] b = new byte[fis.available()];

            fis.read(b);

            String str = new String(b);

            System.out.println(str);
        }

    }
}
