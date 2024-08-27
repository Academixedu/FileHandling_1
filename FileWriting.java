import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
        FileWriter fr = new FileWriter("D:\\Java assignments\\FileHandling_1\\Files.txt");
    BufferedWriter br = new BufferedWriter(fr);
    for(int i=1;i<=10;i++){
        System.out.println("Enter the names");
        String name = scan.nextLine();
        br.write(name);
        br.newLine();
        
        
    }
    br.close();


}
}
