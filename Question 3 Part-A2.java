// TCPClient.java
import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String serverHost = "localhost";
        int serverPort = 5000;
        String message = "Hello from Swati Joshi"; // replace name if desired

        System.out.println("Connecting to server " + serverHost + ":" + serverPort);
        try (Socket socket = new Socket(serverHost, serverPort);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            out.println(message); // send
            System.out.println("Sent to server: " + message);

            String response = in.readLine();
            System.out.println("Received from server: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
