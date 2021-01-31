package model;

import controller.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import view.*;

public class Server {
    ServerSocket serverSocket;

    public void server(){
        try {
            serverSocket = new ServerSocket(6654);
            while (true) {
                System.out.println("loading.......");
                Socket connectSocket = serverSocket.accept();
                DataInputStream dis = new DataInputStream(connectSocket.getInputStream());
                DataOutputStream dos = new DataOutputStream(connectSocket.getOutputStream());
                String in = dis.readUTF();
                switch (in) {
                    case "chat-bot":
                        Date date1 = new Date(System.currentTimeMillis());
                        String time1 = new SimpleDateFormat("hh:mm:ss").format(date1);
                        dos.writeUTF("Chào mừng bạn đến với chat bot? " + "@" + time1);
                        dos.flush();
                        break;
                    case "chat-server":
                        Date date2 = new Date(System.currentTimeMillis());
                        String time2 = new SimpleDateFormat("hh:mm:ss").format(date2);
                        Clients.pnMain.add(new pn_MessClient(dis.readUTF(), time2));
                        dos.writeUTF(Servers.input.getText());
                        dos.flush();
                        break;
                    default:
                        Date date3 = new Date(System.currentTimeMillis());
                        String time3 = new SimpleDateFormat("hh:mm:ss").format(date3);
                        String str = new CheckLike().check(in);
                        dos.writeUTF(in + "@" + str + "@" + time3);
                        dos.flush();
                        break;
                        
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
