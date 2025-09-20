package inputoutputStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo2 {

    public static void main(String[] args) throws Exception {

        ByteArrayOutputStream bos = new ByteArrayOutputStream(10);

        byte[] b = {'H', 'A', 'R', 'S', 'H'};

        bos.write(b);

        bos.writeTo(new FileOutputStream("F:/Java-Lang-Learning_Sep2025/Test.txt"));

        bos.close();
    }
}

// In this example we are writing to the external file.
