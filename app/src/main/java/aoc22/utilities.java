package aoc22;

import java.io.FileInputStream;
import java.io.IOException;

public class utilities {
    public static String getFile(String filename) throws IOException {
        FileInputStream stream = new FileInputStream("./src/main/java/aoc22/" + filename);
        String fullString = "";
        // Save value of stream to fullString
        int i;
        while ((i = stream.read()) != -1) {
            fullString += (char) i;
        }
        stream.close();
        return fullString;
    }
    public static int getWeight(String letter, String[] weights){
        for(int i = 0; i < weights.length; i++){
            if(letter.equals(weights[i])){
                System.out.println(letter + " balls " + i+1);
                return i+1;
            }
        }
        return 0;
    }
}
