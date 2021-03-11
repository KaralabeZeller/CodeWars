package kyu6;

import java.util.Arrays;
import java.util.List;

public class Order {
    public static String order(String words) {
        // ...

        if(words == null)
            return null;

        StringBuilder orderBuilder = new StringBuilder();
        List<String> wordList = Arrays.asList(words.split(" "));

        for (int i = 1; i < 10; i++) {
            for(String word : wordList) {
                if(word.contains(String.valueOf(i))) {
                    orderBuilder.append(word).append(" ");
                }
            }
        }

        return orderBuilder.toString().strip();

    }
}