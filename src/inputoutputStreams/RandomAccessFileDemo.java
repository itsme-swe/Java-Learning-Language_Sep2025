package inputoutputStreams;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

    public static void main(String[] args) throws Exception {

        RandomAccessFile raf = new RandomAccessFile("F:/Java-Lang-Learning_Sep2025/Test2.txt", "rw");

        // abcDefghij

        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        System.out.println((char) raf.read());

        raf.write('D');

        raf.skipBytes(3);

        System.out.println((char) raf.read());

        raf.seek(3);    // Now we are moving to index 3

        System.out.println((char) raf.read());

        System.out.println(raf.getFilePointer());   // 4 -- bcoz write now pointer is on index 4


        raf.close();
    }
}
