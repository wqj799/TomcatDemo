package ex01.pyrmont;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class HttpServer {
    public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "webapp";
    private static final String SHUTDOWN_COMMAND = "/SHUTDOWN";
    private boolean shutdown = false;

    public static void main(String[] args) {
        HttpServer server = new HttpServer();
        server.await();
    }

    public void await() {
        ServerSocket serverSocket = null;
        int port = 8080;

        try{
            serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
            
        }catch(IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
