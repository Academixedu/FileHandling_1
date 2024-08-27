import java.io.*;

public class FileReading {
    public static void main(String[] args) {
        try {
            // FileReader to read the file
            FileReader br = new FileReader("C:/Users/mekam/OneDrive/Desktop/Java/FileHandling_1/Files.txt");
            BufferedReader bf = new BufferedReader(br);
            
            String str = bf.readLine();
            while (str != null) {
                System.out.println(str);
                str = bf.readLine();  // Read next line
            }
            
            bf.close();  // Close BufferedReader
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

           
           
        } 
        
    }
}
