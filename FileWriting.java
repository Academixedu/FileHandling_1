import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        FileWriter fw=new FileWriter("C:\\academix\\java basics\\FileHandling_1\\Files.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("import languages to learn");
        bw.newLine();
        for(int i=1;i<=5;i++){
            System.out.println("Enter language " + i + ":");

            String lang=sc.nextLine();
            bw.write(lang);
            bw.newLine();
        }
        bw.close();
    }
}
