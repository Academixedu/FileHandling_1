import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String[] args) throws IOException {
    FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\excep ass\\FileHandling_1\\Files.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    bw.write("sai");
    bw.newLine();
    bw.write("kumar");
    bw.newLine();
    bw.close();
    
}
}
