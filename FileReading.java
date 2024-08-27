import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws IOException {
    FileReader fir = new FileReader("D:\\Java assignments\\FileHandling_1\\Files.txt");
    BufferedReader bur= new BufferedReader(fir);
    String hi ="";
    while((hi=bur.readLine())!=null){
        System.out.println(hi);
    }
    bur.close();

}
}
