import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer

    public static void main(String[] args)throws IOException{
        FileWriter fw = new FileWriter("\"C:\\Users\\Swaroopa\\OneDrive\\Desktop\\file\"");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("java");
        bw.newLine();
        bw.write("swaroopa");
        bw.newLine();
        bw.write("programming");
        bw.newLine();
        bw.close();
    }
}
