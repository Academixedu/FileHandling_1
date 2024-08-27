import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String args[]) throws IOException {
FileWriter fr=new FileWriter("C:\\pogo1.0\\assignment\\Javawrite24File.txt");
BufferedWriter br=new BufferedWriter(fr);
    br.write("PSVSAI");
    br.newLine();
    br.write("MAHESH");
    br.close();
}
}
