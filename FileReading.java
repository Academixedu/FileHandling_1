import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws Exception
{
    
    FileReader in = new FileReader("C:\\Users\\gkavi\\OneDrive\\Desktop\\untroll\\FileHandling_1\\Files.txt");
    BufferedReader b= new BufferedReader(in);
    String li="";
    while ((li = b.readLine()) != null) 
    {
        System.out.println(li);
    }
    b.close();
}
}
