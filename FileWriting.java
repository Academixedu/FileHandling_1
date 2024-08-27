import java.io.*;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
    
 public static void main(String[] args) throws IOException {
      
      FileWriter fr = new FileWriter("E:\\Srinadh personals\\Sample Folders\\LogicalAssignmet\\FileHandling_1\\Files.txt");

     BufferedWriter br = new BufferedWriter(fr);
        br.write("ABC");
        br.newLine();
        br.write("XYZ");
        br.newLine();
        br.write("PQR");
        br.newLine();
        br.close();

       
 }
}
 

