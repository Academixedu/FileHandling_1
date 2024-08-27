import java.io.*;
public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader

    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\chokk\\Desktop\\practice\\FileHandling_1\\Files.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            while(str!=null){
                System.out.println(str);
                str = br.readLine();
            } 
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
