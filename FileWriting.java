import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
        public static void main(String[] args)throws IOException {
            FileWriter fr = new FileWriter("E:\\java assinment\\FileHandling_1\\Files.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("Ritesh");
            br.newLine();
            br.write("Alekha");
            br.newLine();
            br.write("Balu");
            br.close();

        }
}
