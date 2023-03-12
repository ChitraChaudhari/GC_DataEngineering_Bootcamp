import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamExample {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("test.png");
            outputStream = new FileOutputStream("copiedtest.png");

            int byteRead;
            while((byteRead = inputStream.read())!=-1 ){
                outputStream.write(byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                inputStream.close();
                outputStream.close();
            } catch (Exception e) {
                System.out.println("Error Occurred");
                e.printStackTrace();    
            }
        }
    }
}