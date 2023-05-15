package Lab10.ServerApplication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer{
        private ServerSocket serverSocket;
        private boolean running;

        public GameServer(int port) {
            try {
                serverSocket = new ServerSocket(port);
                running = true;
                System.out.println("Server started on port " + port);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    /**
     *  when a client connects, it creates a new ClientThread and starts it
     */
    public void start() {
            //waiting for client connections
            while (running) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    ClientThread clientThread = new ClientThread(clientSocket);
                    clientThread.start();//calls run() method from ClientThread
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    /**
     * used to stop the server
     * closes the server socket
     */
    public void stop() {
            running = false;
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            int port = 1234; // Change this to your desired port number
            GameServer gameServer = new GameServer(port);
            gameServer.start();
        }
}
