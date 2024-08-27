import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws IOException {
     String filePath = "C:\\Users\\HP\\OneDrive\\Desktop\\assign_6.000\\FileHandling_1\\Files.txt";
    // String filePath="Files.txt";
    FileReader fr=new FileReader(filePath);
    BufferedReader br=new BufferedReader(fr);
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
    br.close();
}
}
