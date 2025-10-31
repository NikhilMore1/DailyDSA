package collection_Framework.fileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("note.txt")){
            int letter = fr.read();
            while (fr.ready()){
                System.out.print((char) letter);
                letter = fr.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
