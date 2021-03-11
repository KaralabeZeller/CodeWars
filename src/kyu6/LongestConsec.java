package kyu6;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        // your code

        String longest = "";

        for(int i = 0; i < strarr.length +1 -k; i++) {

            StringBuilder sb = new StringBuilder();
            for(int j = i; j < i + k; j++) {
                sb.append(strarr[j]);
            }

            longest = sb.toString().length() > longest.length() ? sb.toString() : longest;
        }

        return longest;
    }
}