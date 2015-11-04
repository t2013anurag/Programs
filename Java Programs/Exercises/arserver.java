import java.io.*;
import java.net.*;

 
public class arserver
{
 
    private static Socket skt;
 
    public static void main(String[] args)
    {
        try
        {
 
            ServerSocket serverSocket = new ServerSocket(25000);
            System.out.println("Server Started and listening to the port 25000");
 
            
            while(true)
            {
                //Reading the message from the client
                skt = serverSocket.accept();

                BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
                String number = br.readLine();
                System.out.println("Message received from client is "+number);
 
                //find the area and forming the return message
                String rmsg;
		float no = Float.parseFloat(number);
                double area = no*no*3.14 ;
                
                rmsg = String.valueOf(area) + "\n";
                
                //Sending the response back to the client.
                PrintWriter bw = new PrintWriter(new OutputStreamWriter(skt.getOutputStream()));
                bw.write(rmsg);
                System.out.println("Message sent to the client is "+rmsg);
                bw.flush();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                skt.close();
            }
            catch(Exception e){}
        }
    }
}