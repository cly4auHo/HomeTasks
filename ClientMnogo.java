package courses;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMnogo {

    public static void main(String[] args) {
        try {
            Scanner scaner = new Scanner(System.in);
            Socket s = new Socket(InetAddress.getByName("172.17.13.68"), 3134);

            String data = "Hi,i`m in televizor";

            byte[] buf = new byte[64 * 1024];
            int r = s.getInputStream().read(buf);
            data = new String(buf, 0, r);

            while (true) {
                data = scaner.nextLine();
                s.getOutputStream().write(data.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
