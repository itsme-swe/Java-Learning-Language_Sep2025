package inputoutputStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingDemo2 {

    public static void main(String[] args) {

        try {
            FileOutputStream fs = new FileOutputStream("F:/Java-Lang-Learning_Sep2025/Test2.txt");

            String str = "New way to create file using byte array";

            byte[] b = str.getBytes();

            for (byte ele : b) {
                fs.write(ele);
            }

            fs.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
