import java.io.*;
import java.net.*;

public class udpc {

  public static void main(String[] args) throws Exception {
    DatagramSocket s = new DatagramSocket();
    byte[] buf = new byte[1000];
    DatagramPacket dp = new DatagramPacket(buf, buf.length);
    System.out.println("Receiving message");
    s.receive(dp);
    String rcvd = "rcvd from " + dp.getAddress() + ", " + dp.getPort() + ": "
          + new String(dp.getData(), 0, dp.getLength());
    System.out.println(rcvd);
  }
}
