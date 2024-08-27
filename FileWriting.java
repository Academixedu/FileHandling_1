public class FileWriting{
    // Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
      
        public static void main(String[] args)throws IOException{
            FileWriter fw = new FileWriter("C:\\Users\\Swapna\\Desktop\\practice\\FileHandling_1\\Files.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Swapna");
            bw.newLine();
            bw.write("Rocky");
            bw.newLine();
            bw.close();
        }
    }
