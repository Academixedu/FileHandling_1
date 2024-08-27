import java.io.*;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("C:/Users/mekam/OneDrive/Desktop/Java/FileHandling_1/Files.txt");
        BufferedWriter b = new BufferedWriter(f);
        
        b.write("this is file writing");
        b.newLine();
        b.write("this is second line");
        b.newLine();
        
        b.close();
        System.out.println("File Written Successfully");
    }
}
