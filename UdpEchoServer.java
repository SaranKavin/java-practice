import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpEchoServer {
    public static void main(String[] args) {
        int port = 9999; // Listening port

        try (DatagramSocket serverSocket = new DatagramSocket(port)) {
            System.out.println("UDP Echo Server started on port " + port);

            byte[] buffer = new byte[1024];

            while (true) {
                DatagramPacket requestPacket = new DatagramPacket(buffer, buffer.length);
                serverSocket.receive(requestPacket);

                String receivedData = new String(requestPacket.getData(), 0, requestPacket.getLength());
                System.out.println("Received: " + receivedData);

                // Echo back the received packet
                DatagramPacket responsePacket = new DatagramPacket(
                        receivedData.getBytes(), receivedData.length(),
                        requestPacket.getAddress(), requestPacket.getPort());
                serverSocket.send(responsePacket);
                System.out.println("Echoed: " + receivedData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
