import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myObj = new FileWriter("/home/chitraksonawane/FileHandling/TestFile.txt"); 
            myObj.write("Chitra 123,fc road 9375945769\nkiran 456, gm road 2482386000");      
            myObj.close();
            System.out.println("Successfully wrote to the file.");     
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    
}
