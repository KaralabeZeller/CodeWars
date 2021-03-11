package kyu6;

public class WordScore {

    public static String high(String s) {

        int relativeASCIIDiff = 96;

        String words[] = s.split(" ");

        int biggestScore = 0;
        String returnWord = "";

        for( String word : words) {
            int score = 0;
            for(char character : word.toCharArray()) {
                score += (int)character - relativeASCIIDiff;
            }

            if(score > biggestScore) {
                biggestScore = score;
                returnWord = word;
            }
        }

        return returnWord;
    }


}
