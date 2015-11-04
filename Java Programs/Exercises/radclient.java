import java.io.*;
import java.net.*;
 
public class radclient
{
 
    private static Socket skt;
 
    public static void main(String args[])
    {
        try
        {
            skt = new Socket("localhost", 25000);
 
            //Send the message to the server
            PrintWriter bw = new PrintWriter(new OutputStreamWriter(skt.getOutputStream()));
 
            String number = "2";
 
            String smsg = number + "\n";
            bw.write(smsg);
            bw.flush();
            System.out.println("Message sent to the server : "+smsg);
 
            //Get the return message from the server
            BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            String message = br.readLine();
            System.out.println("Message received from the server : " +message);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            //Closing the socket
            try
            {
                skt.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}