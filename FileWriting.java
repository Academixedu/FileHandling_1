
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
    // Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String[] args)throws IOException {
    FileWriter f = new FileWriter("C:\\Users\\sujat\\OneDrive\\Desktop\\s\\FileHandling_1\\Files.txt");
    BufferedWriter br = new BufferedWriter(f);
    br.write("sujatha");
    br.newLine();
    br.write("swarupa");
    br.newLine();
    br.write("kavitha");
    br.newLine();
    br.close();
}
}

