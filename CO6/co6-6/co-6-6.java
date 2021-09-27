import java.io.IOException;
import java.net.InetAddress; 
import java.net.SocketException;
import java.net.DatagramSocket; 
import java.net.DatagramPacket;
import java.util.Scanner;

public class UDPServer {

       public static void main(String[] args) throws SocketException, IOException { 
    DatagramSocket sSocket = new DatagramSocket(9876);
    while(true) {

           byte[] sendbuffer = new byte[1024]; byte[] receivebuffer = new byte[1024];

        DatagramPacket rcvdpkt = new DatagramPacket(receivebuffer,

        receivebuffer.length);
        sSocket.receive(rcvdpkt);
        InetAddress IP = rcvdpkt.getAddress(); int portNo = rcvdpkt.getPort();
        String clData = new String(rcvdpkt.getData()); 
        System.out.println("\nCLIENT: " + clData); System.out.println("\nSERVER: ");

        Scanner sc = new Scanner(System.in); 
        String serData = sc.nextLine(); 
        sendbuffer = serData.getBytes();
        DatagramPacket sendpkt = new DatagramPacket(sendbuffer, sendbuffer.length, IP, portNo);
        sSocket.send(sendpkt);

        if(serData.equalsIgnoreCase("Bye")) { 
            
            System.out.println("Connection dropped by Server. . !"); 
                       }
               }
              sSocket.close();
       }
}

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException; 
import java.net.DatagramSocket; 
import java.net.DatagramPacket; 
import java.util.Scanner;

public class UDPClient {

public static void main(String[] args) throws SocketException, IOException {

InetAddress IP = InetAddress.getByName("localhost"); DatagramSocket csocket = new DatagramSocket();

while(true) {
byte[] sendbuffer = new byte[1024]; byte[] receivebuffer = new byte[1024]; System.out.println("\n\nCLIENT: "); Scanner sc = new Scanner(System.in); String clientData = sc.nextLine(); sendbuffer = clientData.getBytes();

DatagramPacket sndpkt = new DatagramPacket(sendbuffer, sendbuffer.length, IP, 9876);
csocket.send(sndpkt);;

if(clientData.equalsIgnoreCase("Bye")) { 
              System.out.println("Connection dropped by Client. .!"); 
             break;
}

DatagramPacket rcvpkt = new DatagramPacket(receivebuffer,
receivebuffer.length);
csocket.receive(rcvpkt);
String serverData = new String(rcvpkt.getData()); 
System.out.print("\nSERVER: "+ serverData);

}
csocket.close();
}
}
