import java.io.File;
import java.util.Scanner;
public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("/home/chitraksonawane/FileHandling/TestFile.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            System.out.println("File read successfully");
        } catch (Exception e) {
            System.out.println("File read error");
            e.printStackTrace();
        }
        
    }
}
