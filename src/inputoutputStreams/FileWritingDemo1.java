package inputoutputStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingDemo1 {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("F:/Java-Lang-Learning_Sep2025/Test.txt");

            String str = "Learn IO Stream";

            fos.write(str.getBytes());

            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
