import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) throws IOException {      
        FileReader fr = new FileReader("D:\\Java\\Regex_1\\FileHandling_1\\FileReading.java");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        
        br.close();
    }
}