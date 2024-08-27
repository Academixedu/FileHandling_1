import java.io.*;
public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer

    public static void main(String[] args)throws IOException {

        FileWriter fw = new FileWriter("Files.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Load the Content Here");
        bw.newLine();
        bw.write(".");
        bw.newLine();
        bw.write("This is a FileReading Concept");
        bw.newLine();
        bw.write(".");
        bw.newLine();
        bw.write("After stroing data in a file -Filewriting");
        bw.newLine();
        bw.write(".");
        
        bw.newLine();
        bw.close();
        fw.close();

        System.out.println("File Written Successfully");
    }
}
