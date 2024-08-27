//mport java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.file.Files;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String args[]) throws IOException {
FileWriter fr=new FileWriter("C:\\Users\\HP\\personal_projects\\Java\\FileHandling_1\\Files.txt");
BufferedWriter br=new BufferedWriter(fr);
br.write("sanky");
br.newLine();
br.write("syam");
br.close();
}}
