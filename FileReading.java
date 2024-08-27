import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("C:\\academix\\java basics\\FileHandling_1\\Files.txt");
        BufferedReader br=new BufferedReader(fr);
        String li="";
        while((li=br.readLine())!=null){
            System.err.println(li);
        }
    }
}




















