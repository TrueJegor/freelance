package Collections;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionTeach {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Jegor\\IdeaProjects\\Teach\\src\\Collections\\test.txt");
        int lenght = fis.available();
        byte[] data = new byte[lenght];
        fis.read(data);

        String text = new String(data);
        //System.out.println(text);

        ArrayList<String[]> lineWords = new ArrayList<>();

        String[] lines = text.split("\n");
        for(String s : lines){
            String [] words = s.split(",");
            lineWords.add(words);
        }

        lenght = lineWords.size();

        for(int i = 0; i < lines.length; i++){
            for(int j = 0; j < lineWords.size(); j++){
                System.out.println(lineWords.get(i));
            }
        }

    }
}
