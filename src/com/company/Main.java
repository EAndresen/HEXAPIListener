package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        Runnable serverTask = () -> {
            try {
                ServerSocket serverSocket = new ServerSocket(5000);
                Socket socket = serverSocket.accept();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String content = bufferedReader.readLine();

                System.out.println(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        serverTask.run();

    }
}
