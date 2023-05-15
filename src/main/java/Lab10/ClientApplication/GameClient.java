package Lab10.ClientApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GameClient{
        private Socket socket;
        private BufferedReader inputReader;
        private PrintWriter out;

    /**
     * makes a connection with the server using the server address and port provided
     * @param serverAddress
     * @param port
     */
    public GameClient(String serverAddress, int port){
            try {
                socket = new Socket(serverAddress, port);
                // create a buffered reader that reads text from the keyboard
                inputReader = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(socket.getOutputStream(), true);
                System.out.println("Client started on port:"+ port);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void start () {
            try {
                String command;
                while ((command = inputReader.readLine()) != null) {
                    out.println(command);
                    //if the user enters "exit", the client application stops
                    if (command.equals("exit")) {
                        break;
                    }
                }

                inputReader.close();
                out.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main (String[]args){
            String serverAddress = "localhost"; // Change this to your server address
            int port = 1234; // Change this to your server port number
            GameClient gameClient = new GameClient(serverAddress, port);
            gameClient.start();
        }
}
