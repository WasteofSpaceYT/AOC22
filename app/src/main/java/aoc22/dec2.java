package aoc22;

import java.io.IOException;

public class dec2 {
    public static void run(String filename, int part) throws IOException {
        String moveSetString = utilities.getFile(filename);
        String[] moveSets = moveSetString.split("\n");
        int score = 0;
        for(String move : moveSets){
            String[] eachMove = move.split(" ");
            int rock = 1;
            int paper = 2;
            int scissors = 3;
            int win = 6;
            int lose = 0;
            int tie = 3;
            if(part == 1){
            if(eachMove[0].equals("A")){
                switch(eachMove[1]){
                    case "X":
                        score += rock + tie;
                        break;
                    case "Y":
                        score += paper + win;
                        break;
                    case "Z":
                        score += scissors + lose;
                        break;
                }
            } else if(eachMove[0].equals("B")){
                switch(eachMove[1]){
                    case "X":
                        score += rock + lose;
                        break;
                    case "Y":
                        score += paper + tie;
                        break;
                    case "Z":
                        score += scissors + win;
                        break;
                }
            } else if(eachMove[0].equals("C")){
                switch(eachMove[1]){
                    case "X":
                        score += rock + win;
                        break;
                    case "Y":
                        score += paper + lose;
                        break;
                    case "Z":
                        score += scissors + tie;
                        break;
                }
            }
        }else if(part == 2){
            if(eachMove[0].equals("A")){
                switch(eachMove[1]){
                    case "Z":
                        score += paper + win;
                        break;
                    case "Y":
                        score += rock + tie;
                        break;
                    case "X":
                        score += scissors + lose;
                        break;
                }
            } else if(eachMove[0].equals("B")){
                switch(eachMove[1]){
                    case "Z":
                        score += scissors + win;
                        break;
                    case "Y":
                        score += paper + tie;
                        break;
                    case "X":
                        score += rock + lose;
                        break;
                }
            } else if(eachMove[0].equals("C")){
                switch(eachMove[1]){
                    case "Z":
                        score += rock + win;
                        break;
                    case "Y":
                        score += scissors + tie;
                        break;
                    case "X":
                        score += paper + lose;
                        break;
                }
            }
        }
    } 
        System.out.println(score);
    }
}