package Lesson_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerForChat {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        try {
            server = new ServerSocket(8881);
            System.out.println("Server is running!");
            clientSocket = server.accept();
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            Thread clientThread = new Thread(ServerForChat::run);
            clientThread.setDaemon(true);
            clientThread.start();
        } catch (IOException e) {
            e.printStackTrace();

        }
        reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter your message: ");
            String word = reader.readLine();
            out.write(word + "\n");
            out.flush();
            if (word.equals("/end")){
                System.out.println("Client disconnected...");
                server.close();
                break;
            }
            out.write("Server : " + word);
        }
    }
    private static void run() {
        while (true) {
            try {
                String str = in.readLine();
                if (str.equals("/end")) {
                    System.out.println("Client disconnected...");
                    System.exit(0);
                    clientSocket.close();
                    server.close();
                    in.close();
                    out.close();
                }
                System.out.println(str);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}

