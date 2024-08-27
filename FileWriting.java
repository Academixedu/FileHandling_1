import java.io.*;
public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer

    public static void main(String[] args)throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\chokk\\Desktop\\practice\\FileHandling_1\\Files.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("java programming by using IO-pacakage");
        bw.newLine();
        bw.write("java programming by using Regex-pacakage");
        bw.newLine();
        bw.write("java programming by using Collections concept");
        bw.newLine();
        bw.close();
    }


}
