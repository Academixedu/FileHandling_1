import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("C:\\ACAD\\JAVA_ASSIGNMENTS\\Filehandling1\\FileHandling_1\\Files.txt");
    BufferedReader br = new BufferedReader(fr);
    String s ="";
    while((s=br.readLine())!=null)
    {
        System.out.println(s);
    }
    
}
}
