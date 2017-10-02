package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Runnable serverTask = () -> {
            try {
                ServerSocket serverSocket = new ServerSocket(5000);
                Socket socket = serverSocket.accept();
                InputStream stream = socket.getInputStream();
                Scanner reader = new Scanner(stream);

                    while (reader.hasNextLine()) {
                        System.out.println(reader.nextLine());
                    }
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        serverTask.run();
    }
}
