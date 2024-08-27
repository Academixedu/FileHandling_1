import java.io.*;
public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader

public static void main(String[] args)throws IOException {
    try {
        FileReader fr = new FileReader("Files.txt");
        BufferedReader br = new BufferedReader(fr);

        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }

        br.close();
        //fr.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
