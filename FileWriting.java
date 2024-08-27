import java.io.*;
public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer

    public static void main(String[] args)throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\USER\\Desktop\\FileHandlingAss\\FileHandling_1\\Files.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("This is the first line of File");
        bw.newLine();
        bw.write("This is the second line of File");
        bw.newLine();
        bw.close();
    }


}
