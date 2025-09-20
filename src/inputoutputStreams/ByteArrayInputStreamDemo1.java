package inputoutputStreams;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo1 {

    public static void main(String[] args) throws Exception {

        byte[] arr = {'H', 'A', 'R', 'S', 'H'};

        ByteArrayInputStream bis = new ByteArrayInputStream(arr);

        String str = new String(bis.readAllBytes());

        System.out.println(str);

        bis.close();

    }
}

// In this example we are reading all bytes together.
