
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String[] args) throws IOException {
    

FileWriter fw= new FileWriter("C:\\Users\\ganes\\Desktop\\java basics\\FileHandling_1\\Files.txt");
 BufferedWriter bw=new BufferedWriter(fw);
  bw.write("pak");
  bw.newLine();
  bw.write("gani");
  bw.newLine();
bw.close();
}
}
