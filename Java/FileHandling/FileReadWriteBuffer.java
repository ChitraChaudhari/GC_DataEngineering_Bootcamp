import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteBuffer {
    public static void main(String[] args) {

        String str = "File Reader and Writer API's are pretty simple";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("outputFile.txt"));) {
            bw.write(str);
        } catch (IOException e) {
            System.out.println("Error Ocuured");
            e.printStackTrace();
        }
    }
}
