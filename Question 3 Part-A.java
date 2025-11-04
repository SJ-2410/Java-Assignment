// TCPServer.java
import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int port = 5000;
        System.out.println("Server starting on port " + port + "...");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server waiting for connection...");
            try (Socket socket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String clientMsg = in.readLine();
                System.out.println("Received from client: " + clientMsg);

                // Reply: convert to uppercase
                String reply = clientMsg == null ? "NULL" : clientMsg.toUpperCase();
                out.println(reply);
                System.out.println("Replied with: " + reply);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
