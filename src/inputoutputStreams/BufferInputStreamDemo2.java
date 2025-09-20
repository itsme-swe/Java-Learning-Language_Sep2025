package inputoutputStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStreamDemo2 {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("F:/Java-Lang-Learning_Sep2025/Test2.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        int x;

        while ((x = bis.read()) != -1) {
            System.out.print((char) x + " ");
        }

        // op: N e w   w a y   t o   c r e a t e   f i l e   u s i n g   b y t e   a r r a y

        bis.close();

        fis.close();
    }
}

// This is the way to read data from buffer byte by byte.