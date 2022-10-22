package OOPHW5.HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
3. Дописать простейший веб сервер, который начали писать на вебинаре, чтобы он отправлял в качестве ответа
 на запрос содержимлое файла из HTTP-запроса.
 */

public class Server {

    private static String directotyPath = "/Users/wind/Desktop/Study/7. Java/3. Homewoks/hw/src/main/java/OOPHW5/HTTP/WWW/";

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);

            for(;;) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8));

                PrintWriter writer = new PrintWriter(
                        socket.getOutputStream());

                while (!reader.ready()) ;

                String info = reader.readLine();
                String[] splitInfo = info.split(" ");
                System.out.println(info);

                while (reader.ready()) {
                    System.out.println(reader.readLine());
                }

                Path getPage = Paths.get(directotyPath, splitInfo[1]);

                if (Files.exists(getPage)) {
                    writer.println("HTTP/1.1 200 OK");
                    writer.println("Content-Type: text/html; charset=utf-8");
                    writer.println();
                    Files.newBufferedReader(getPage).transferTo(writer);
                    writer.flush();
                    break;
                }
                writer.println("HTTP/1.1 404 NOT_FOUND");
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println();
                writer.println("<h1>File not found</h1>");
                writer.flush();

                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
