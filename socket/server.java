package socket;
import java.io.*;
import java.net.*;


public class server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1234);
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String message = in.readUTF();
            System.out.println("Message from client: " + message);
            out.writeUTF("Hello from server");
            server.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
