import java.io.*;
import java.net.*;

public class App {

    public static String transmit() throws Exception {

        Thread serverThread = new Thread(() -> {
            try {
                ServerSocket server = new ServerSocket(6000);
                Socket socket = server.accept();

                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));

                String msg = in.readLine();
                System.out.println("Received: " + msg);

                socket.close();
                server.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        serverThread.start();

        Thread.sleep(500);

        Socket client = new Socket("localhost", 6000);
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println("Message sent");

        client.close();

        return "Transmission successful";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(transmit());
    }
}