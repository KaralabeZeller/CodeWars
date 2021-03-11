package kyu6;

public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment

        if(phrase == null || phrase.length() == 0)
            return null;

        StringBuilder jadenBuilder = new StringBuilder();
        for (String word : phrase.split(" ")) {
            jadenBuilder.append(word.substring(0,1).toUpperCase()).append(word.substring(1)).append(" ");
        }

        return jadenBuilder.toString().strip();
    }

}