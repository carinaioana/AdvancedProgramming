package Lab10.ServerApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * handles communication with a specific client
 */
public class ClientThread  extends Thread {
    private Socket clientSocket;

    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    /**
     * the thread reads commands from the client and sends back appropriate response
     * overrides the start method
     */
    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String command;
            while ((command = in.readLine()) != null) {
                if (command.equals("stop")) {
                    System.out.println("Server stopped");
                    break;
                } else {
                    handleCommand(command, out);
                }
                //ensures that any buffered data is written to its destination
                out.flush();
            }

            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void handleCommand(String command, PrintWriter out) {
        System.out.println("Server received the request: " + command);

        if (command.startsWith("create game")) {
            System.out.println("Game created");

        } else if (command.startsWith("join game")) {
            System.out.println("Joined game");

        } else {
            System.out.println("Invalid command");
        }
    }
}
