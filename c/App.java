import java.io.*;
import java.net.*;

public class App {

    public static String runSocket() throws Exception {

        // Server
        Thread serverThread = new Thread(() -> {
            try {
                ServerSocket server = new ServerSocket(5000);
                Socket socket = server.accept();

                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));

                String msg = in.readLine();
                System.out.println("Server received: " + msg);

                socket.close();
                server.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        serverThread.start();

        // Give server time to start
        Thread.sleep(500);

        // Client
        Socket client = new Socket("localhost", 5000);
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println("Hello");

        client.close();

        return "Socket communication successful";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(runSocket());
    }
}