

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String args[]) throws IOException {
FileWriter fr=new FileWriter("C:\\\\ACAD\\\\JAVA_ASSIGNMENTS\\\\Filehandling1\\\\FileHandling_1\\\\Files.txt");
BufferedWriter br=new BufferedWriter(fr);
    br.write("MANI");
    br.newLine();
    br.write("YOGI");
    br.close();
}
}
