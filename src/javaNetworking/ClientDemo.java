package javaNetworking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientDemo {

    public static void main(String[] args) throws Exception {

        Socket stk = new Socket("192.168.0.103", 5000);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // Reading from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));

        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do {
            msg = keyboard.readLine();

            ps.println(msg);

            msg = br.readLine();
            System.out.println("From Server " + msg);
        } while (!msg.equals("dne"));
        stk.close();


    }
}
