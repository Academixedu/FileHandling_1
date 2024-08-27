import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws IOException {
    

FileReader f1=new FileReader("C:\\Users\\Swarupa Jangam\\OneDrive\\Desktop\\Buffers\\FileHandling_1\\Files.txt");
 BufferedReader b1=new BufferedReader(f1);
 String data="";
 while((data=b1.readLine())!=null){
    System.out.println(data);

 }
b1.close();

}
}