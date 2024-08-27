import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
  
    public static void main(String[] args)throws IOException{
        FileWriter fw = new FileWriter("\"C:\\Users\\user\\Desktop\\assigments\\file\\Files.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("java programming ");
        bw.newLine();
        bw.write("python programming ");
        bw.newLine();
        bw.write("c programming ");
        bw.newLine();
        bw.close();
    }
}
