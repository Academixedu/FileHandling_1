import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String args[]) throws IOException{
    FileWriter fr = new FileWriter("C:\\Users\\Karthik\\Documents\\Assignments\\FileHandling_1\\Files.txt");
    BufferedWriter br = new BufferedWriter(fr);
    br.write("Maseed");
    br.newLine();
    br.write("nayeem");
    br.newLine();
    br.write("pretham");
    br.close();
}
}
