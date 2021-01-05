package model;

import controller.CheckLike;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.*;
import view.Clients;

public class Server {

    Clients clients = new Clients();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6654);
            while (true) {
                Socket connectSocket = serverSocket.accept();
                DataInputStream dis = new DataInputStream(connectSocket.getInputStream());
                DataOutputStream dos = new DataOutputStream(connectSocket.getOutputStream());
                Date date = new Date(System.currentTimeMillis());
                String time = new SimpleDateFormat("hh:mm:ss").format(date);
                String in = dis.readUTF();
                String str = new CheckLike().check(in);
                dos.writeUTF(in + "@" + str + "@" + time);
                dos.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
