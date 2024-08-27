
import java.io.IOException;
import java.io.BufferedWriter;
import  java.io.FileWriter;;
public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String[] args) throws IOException
{
    
    FileWriter in = new FileWriter("C:\\Users\\gkavi\\OneDrive\\Desktop\\untroll\\FileHandling_1\\Files.txt");
    BufferedWriter b= new BufferedWriter(in);
    b.write("kavitha\n");
    b.write("sujatha\n");
    b.write("swarupa\n");
    b.close();
}
}
