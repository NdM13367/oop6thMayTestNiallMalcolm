package Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static Core.LottoServiceDetails.LISTENING_PORT;

public class LottoServiceClient
{
    public static void main(String[] args) throws IOException
    {
        Socket dataSocket = new Socket("localhost", LISTENING_PORT);


        //Step 1: Establish a channel to communicate

        //Step 2: Build the input and output streams

        OutputStream out = dataSocket.getOutputStream();
        PrintWriter output = new PrintWriter(new OutputStreamWriter(out));

        InputStream in = dataSocket.getInputStream();

        //Step 3: Get input from user

        //Step 4: Send message to server and display the response
    }
}
