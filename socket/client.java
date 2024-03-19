package socket;
import java.io.*;
import java.net.*;

public class client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Hello from client");
            String message = in.readUTF();
            System.out.println("Message from server: " + message);
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}