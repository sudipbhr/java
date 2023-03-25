// server side program to show the socket implementation in java
import java.net.*;
import java.io.*;
import java.util.*;

public class ServerSide {
    public static void main(String args[]) throws IOException{
        // registering the service at the port 1254
        ServerSocket ss = new ServerSocket(1254);
        
        // wait and accept the connection request from the client
        Socket cs = ss.accept();

        // get a communication stream associated with the socket
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

        // perform IO operation
        String s = ins.nextLine();
        System.out.println("from client: "+s);
        outs.println("hello client"):

        // close the streams and connections

        outs.close();
        ins.close();
        cs.close();
        ss.close();

    }
}
