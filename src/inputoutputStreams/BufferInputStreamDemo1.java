package inputoutputStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStreamDemo1 {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("F:/Java-Lang-Learning_Sep2025/Test2.txt");

        BufferedInputStream bis = new BufferedInputStream(fis); // Buffer is connected to FileInputStream

        String str = new String(bis.readAllBytes());

        System.out.println(str);    // New way to create file using byte array


    }
}

// This is the way to read all data together from buffer.
