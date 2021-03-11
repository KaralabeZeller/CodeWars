package kyu6;

public class AntiCamel {

    public static String camelCase(String input) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            if(input.substring(i, i+1).equals(input.substring(i, i+1).toUpperCase())) {
                sb.append(" ").append(input.substring(i, i+1));
            }
            else
                sb.append(input.substring(i, i+1));

        }
        return sb.toString();
    }
}


