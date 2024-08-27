import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting
{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws IOException
{
    FileWriter fr=new FileWriter("E:\\File Handling\\File Handling\\FileHandling_1\\Files.txt");
    BufferedWriter br=new BufferedWriter(fr);
    br.write("Shreyash Avinash Arghode Arghode;!!!!!");
    br.newLine();
    br.write("Happy Birthday Shreyash =()");
    br.close();
}
}
