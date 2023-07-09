import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//Socket Programming 
public class server {
    private ServerSocket serverSocket;
    private Socket clientSocket1;
    private Socket clientSocket2;

    public server() {
        try {
            serverSocket = new ServerSocket(1234);
            System.out.println("Server started. Waiting for clients to connect...");

            // Terima koneksi dari client pertama
            clientSocket1 = serverSocket.accept();
            System.out.println("Client 1 connected.");

            // Terima koneksi dari client kedua
            clientSocket2 = serverSocket.accept();
            System.out.println("Client 2 connected.");

            // Mulai permainan
            startGame();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Tutup socket dan serverSocket jika sudah selesai
                if (clientSocket1 != null) {
                    clientSocket1.close();
                }
                if (clientSocket2 != null) {
                    clientSocket2.close();
                }
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void startGame() {
 
    }

    public static void main(String[] args) {
        new server();
    }
}
