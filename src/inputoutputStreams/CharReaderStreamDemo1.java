package inputoutputStreams;

import java.io.CharArrayReader;

public class CharReaderStreamDemo1 {

    public static void main(String[] args) throws Exception {

        char[] ch = {'B', 'M', 'W', 'M', 'S', 'E', 'R', 'I', 'E', 'S'};

        CharArrayReader cr = new CharArrayReader(ch);

        int x;

        while ((x = cr.read()) != -1) {
            System.out.print((char) x + " ");
        }

        cr.close();
    }
}

// B M W M S E R I E S
