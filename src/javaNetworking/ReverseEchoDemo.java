package javaNetworking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEchoDemo {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);

        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));

        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            msg = br.readLine();

            sb = new StringBuilder(msg);
            sb.reverse();
            msg.toString();

            ps.println(msg);

        } while (!msg.equals("dne"));
        stk.close();
    }
}
