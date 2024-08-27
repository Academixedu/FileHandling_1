import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) throws IOException {      
        FileReader fr = new FileReader("E:\\File Handling\\File Handling\\FileHandling_1\\Files.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        
        br.close();
    }
}