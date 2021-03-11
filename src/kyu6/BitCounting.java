package kyu6;

public class BitCounting {

    public static int countBits(int n){
        // Show me the code!

        return Integer.toBinaryString(n).replaceAll("0", "").length();
    }

}