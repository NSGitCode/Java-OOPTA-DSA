
import java.io.*;
import java.net.*;
import java.util.*;
/**
 *  OOPDA Lab 14A
 *   VerySimpleChatServer
 *     adapted from code presented in HeadFirst Java
 *
 *    (Prof W made a few cosmetic tweaks for OOPDA)
 */

/*     
 * Lab14A_BNicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor,
 * while the rest were all of my own.
 * 
 * Purpose" Testing the Client and Server Applications with threads and runnable.
 * 
 * @author (Nicholas Sin)
 * @version (04/25/2023) 
 */

public class VerySimpleChatServer
{
   static final int PORT_NUM = 5000;
   private ArrayList<PrintWriter> clientOutputStreams;
    
    public class ClientHandler implements Runnable {
        private BufferedReader reader;
        private Socket sock;
        
        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
                
            } catch (Exception ex) { ex.printStackTrace(); }
        } //end ClientHandler method
        
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (Exception ex) { ex.printStackTrace(); }
        } //end run method
    } //end ClientHandler inner class
    
    public static void main(String[] args) {
        new VerySimpleChatServer().go();
    } 
    
    public void go() {
        clientOutputStreams = new ArrayList<>();
        try (ServerSocket serverSock = new ServerSocket(PORT_NUM)) {
        
            while(true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);
                
                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }  //end go() method of class VerySimpleChatServer
    
    public void tellEveryone(String message) {
        Iterator<PrintWriter> it = clientOutputStreams.iterator();
        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }  //end tellEveryone() method of class ChatServer
}  //end VerySimpleChatServer class
