import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try {
            File myObj = new File("TestFile.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created: "+myObj.getName());
            }else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
}
