import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public client() {
        try {
            // Ganti "localhost" dengan alamat IP atau hostname dari server
            socket = new Socket("localhost", 1234);
            System.out.println("Connected to server.");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);

            // Mulai permainan
            startGame();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Tutup socket jika sudah selesai
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void startGame() {
       
    }

    public static void main(String[] args) {
        new client();
    }
}
