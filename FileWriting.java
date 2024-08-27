import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
    public static void main(String[] args) throws IOException {
         FileWriter fr=new FileWriter("C:\\Users\\pavan\\OneDrive\\Pictures\\javabasics\\FileHandling_1\\Files.txt");
        BufferedWriter br=new BufferedWriter(fr);
        br.write("pavs");
        br.newLine();
        br.write("gani");
        br.close();
    }
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
}
