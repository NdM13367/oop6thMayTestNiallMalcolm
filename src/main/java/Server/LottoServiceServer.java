package Server;

import Core.LottoServiceDetails;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;

public class LottoServiceServer
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket listeningSocket = new ServerSocket(LottoServiceDetails.LISTENING_PORT);
        Socket dataSocket = null;

        try
        {
            boolean continueRunning = true;
            int countRequests = 0;

            while(continueRunning)
            {
                System.out.println("Waiting for connections...");
            }
            listeningSocket.close();
        }
        catch(NoSuchElementException nse)
        {
            System.out.println(nse.getMessage());
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
    }
}

