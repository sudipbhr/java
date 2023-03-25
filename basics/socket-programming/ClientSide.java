// client side prgram to show the implementation of socket programming
import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSide{
    public static void main(String args[]){
        // open your connection to a server, at port 1254
        try{
            Socket cs = new Socket("localhost", 1254);
             // get the input file handle from the socket and read the imput
            Scanner ins = new Scanner(cs.getInputStream());
            PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
             // perform IO
            outs.println("Hello server");
            String s = ins.nextLine();
            System.out.println("From server:"+s);

            // close the strams and connection
            ins.close();
            outs.close();
            cs.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }       

    }
}
