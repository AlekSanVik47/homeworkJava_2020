package Lesson_6;

import java.io.*;
import java.net.Socket;

public class ClientForChat {
    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) throws IOException {
        try {
            try {
                clientSocket = new Socket("localhost", 8881);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                System.out.println("Server connection established");
                Thread serverThread = new Thread(() -> {
                    while (true) {
                        try {
                            String str = in.readLine();
                            if (str.equals("/end")) {
                                System.out.println("Server connection disconnected...");
                                System.exit(0);
                            }
                            System.out.println(str);
                        } catch (IOException e) {
                            e.printStackTrace();
                            System.exit(0);
                        }
                    }
                });
                    serverThread.setDaemon(true);
                    serverThread.start();
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    while (true) {
                        try {
                            System.out.println("Enter your message: ");
                            String word = reader.readLine();
                            out.write(word + "\n");
                            out.flush();
                            if (word.equals("/end")){
                                System.out.println("Server connection disconnected...");
                                clientSocket.close();
                                break;
                            }
                            out.write("Customer message : " + word);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            clientSocket.close();
            in.close();
            out.close();
        }

    }
}






