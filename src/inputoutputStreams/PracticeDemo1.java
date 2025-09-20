/*
 * In this practice session, we first create a new file and insert some data into it. Then, we read from this file and copy its contents into another file, this time converting the text to lowercase.
 * */

package inputoutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PracticeDemo1 {

    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileOutputStream("F:/Java-Lang-Learning_Sep2025/Source.txt")) {

            String str = "THIS IS PRACTICE SESSION OF IO STREAMS";

            byte[] b = str.getBytes();

            for (byte ele : b) {
                fos.write(ele);
            }
        }

        try (
                FileInputStream fis = new FileInputStream("F:/Java-Lang-Learning_Sep2025/Source.txt");
                FileOutputStream fs = new FileOutputStream("F:/Java-Lang-Learning_Sep2025/Source2.txt")
        ) {
            int b;

            while ((b = fis.read()) != -1) {
                if (b >= 65 && b <= 90) fs.write(b + 32);
                else fs.write(b);
            }

        }
    }
}
