
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws IOException {
    FileReader f = new FileReader("C:\\Users\\sujat\\OneDrive\\Desktop\\s\\FileHandling_1\\Files.txt");
    BufferedReader b= new BufferedReader(f);
    String line ="";
    while ((line = b.readLine()) != null) {
        System.out.println(line);
    }
    b.close();

}
}
