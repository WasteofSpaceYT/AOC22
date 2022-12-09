package aoc22;

import java.io.IOException;

public class dec3 {
    public static String[] weights = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public static void run(String filename, int part) throws IOException{
        String sackListText = utilities.getFile(filename);
        String[] sackList = sackListText.split("\n");
        int[] finalWeights = new int[sackList.length];
        int totalWeight = 0;
        for(int i = 0; i < sackList.length; i++){
            String[] sackParts = {sackList[i].substring(0,sackList[i].length()/2), sackList[i].substring(sackList[i].length()/2)};
            String commonChars = "";
            for(String letter : sackParts[0].split("")){
                if(sackParts[1].contains(letter)){
                    commonChars += letter;
                }
            }
            String[] splitCommonChars = commonChars.split("");
            int sackWeight = 0;
            for(String letter : splitCommonChars){
                sackWeight += utilities.getWeight(letter, weights);
            }
            finalWeights[i] = sackWeight;
            for(int weight : finalWeights){
                System.out.println(weight);
                totalWeight += weight;
            }
        }
        System.out.println("Total weight: " + totalWeight);
    }
}
