import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String[] args) throws IOException {
    
    String filePath = "C:\\Users\\HP\\OneDrive\\Desktop\\assign_6.000\\FileHandling_1\\Files.txt";
    String data = "Prasad";
    FileWriter fr=new FileWriter(filePath);
    BufferedWriter br=new BufferedWriter(fr);
    br.write(data);
    br.newLine(); 
    br.close(); 
}
}
