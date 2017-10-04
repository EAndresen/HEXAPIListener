package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);

        while (true) {
            Socket socket = serverSocket.accept();

                try {
                    InputStream stream = socket.getInputStream();
                    Scanner reader = new Scanner(stream);

                        while (reader.hasNextLine()) {
                            System.out.println(reader.nextLine());
                        }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
