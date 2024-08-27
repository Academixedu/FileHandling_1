import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String[] args) throws IOException{
    FileWriter f=new FileWriter("C:\\Users\\Swarupa Jangam\\OneDrive\\Desktop\\Buffers\\FileHandling_1\\Files.txt");
    BufferedWriter b=new BufferedWriter(f);
    b.write("Swarupa\n");
    b.write("Saarah\n");
    b.write("Sanjana\n");
    b.close();


}
}
