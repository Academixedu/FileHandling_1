import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String[] args)throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\chokk\\Desktop\\practice\\FileHandling_1\\Files.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("jaanu");
        bw.newLine();
        bw.write("chaithu");
        bw.newLine();
        bw.write("shannu");
        bw.newLine();
        bw.close();
    }

}
