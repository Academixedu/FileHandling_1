import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting
{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws IOException
{
    FileWriter fr=new FileWriter("D:\\Acadmix\\try actch acssption handling\\FileHandling_1\\Files.txt");
    BufferedWriter br=new BufferedWriter(fr);
    br.write("sarvesh bramhane;!!!!!");
    br.newLine();
    br.write("Happy Birthday sarvesh =()");
    br.close();
}
}