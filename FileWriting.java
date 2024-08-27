import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String args[]) throws IOException{
    FileWriter fr = new FileWriter("C:\\Users\\SHAIK FAYAZ\\Desktop\\exceptionhandling\\FileHandling_1\\Files.txt");
    BufferedWriter br = new BufferedWriter(fr);
    br.write("Fayaz");
    br.newLine();
    br.write("sai");
    br.newLine();
    br.write("karthik");
    br.close();
}
}