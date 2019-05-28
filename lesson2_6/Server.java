package lesson2_6;

/*
Написать консольный вариант клиент\серверного приложения, в котором пользователь может
писать сообщения как на клиентской стороне, так и на серверной. Т.е. если на клиентской
стороне написать «Привет», нажать Enter, то сообщение должно передаться на сервер и там
отпечататься в консоли. Если сделать то же самое на серверной стороне, сообщение,
соответственно, передаётся клиенту и печатается у него в консоли. Есть одна особенность,
которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд.
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Socket socket = null;
        ServerSocket server = null;

        try {
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = server.accept();
            System.out.println("Клиент подключился");
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner concole = new Scanner(System.in);

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String str = in.nextLine();
                        if (str.equals("/end")) {
                            out.println("/end");
                            break;
                        }
                        System.out.println("Клиент: " + str);
                    }
                }
            });
            t1.start();

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String str = concole.nextLine();
                        System.out.println("Сообщение сервера отправлено");
                        out.println(str);
                    }
                }
            });

            t2.setDaemon(true); //Работает, пока существует хоть один основной поток (t1)
            t2.start();

            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}