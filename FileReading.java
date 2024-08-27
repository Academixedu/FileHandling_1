import java.io.*;
public class FileReading{
// Prepare a Logic to Read Data from File and Print IT USing Buffered Reader

    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("E:\\Srinadh personals\\Sample Folders\\LogicalAssignmet\\FileHandling_1\\Files.txt");
            BufferedReader br = new BufferedReader(fr);
            String string = br.readLine();
            while(string!=null){
                System.out.println(string);
                string = br.readLine();
            } 
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
