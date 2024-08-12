package workshop_2;

import java.io.*;

public class FileReadingAndWriting {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\workshop_2\\text.txt")); BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\workshop_2\\file.txt"))){
            String line;
            while((line= reader.readLine())!=null){
                writer.write(line);
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
