import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
 public static void main(String[] args) throws IOException {
    FileReader fr=new FileReader("C:\\Users\\ganes\\Desktop\\java basics\\FileHandling_1\\Files.txt");
    BufferedReader br=new BufferedReader(fr);

            String name="";
            while((name=br.readLine())!=null){
                System.out.println(name);

            }




br.close();
 }
}

