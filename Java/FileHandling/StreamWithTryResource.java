import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamWithTryResource {
    public static void main(String[] args) {
    try(InputStream inputStream = new FileInputStream("/home/chitraksonawane/FileHandling/test.png");
        OutputStream outputStream = new FileOutputStream("/home/chitraksonawane/FileHandling/copiedtest.png");) {
            int byteRead;

            while((byteRead = inputStream.read())!= -1){
                outputStream.write(byteRead);
            }
            System.out.println("File copy complete");
    }catch(IOException e) {
        e.printStackTrace();
        System.out.println("Error Occured");
    }
}
}
