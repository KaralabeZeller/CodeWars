package kyu6;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {

        List<String> mexicanString = new ArrayList<String>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                    continue;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, i));
            sb.append(str.substring(i, i+1).toUpperCase());
            sb.append(str.substring(i+1, str.length()));
            mexicanString.add(sb.toString());
        }

        return mexicanString.toArray(new String[0]);
    }

}