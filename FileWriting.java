import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting
{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader
public static void main(String[] args) throws IOException
{
    FileWriter fr=new FileWriter("D:\\Java\\Regex_1\\FileHandling_1\\FileWriting.java");
    BufferedWriter br=new BufferedWriter(fr);
    br.write("Abhishek Ganpatrao Choudhari");
    br.newLine();
    br.write("Happy Birthday Abhishek =()");
    br.close();
}
}