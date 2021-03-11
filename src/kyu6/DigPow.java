package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DigPow {

    public static long digPow(int n, int p) {
        // your code


        int actualP = p;
        int sum = 0;
        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        List<Integer> digitList = Arrays.stream(digits).boxed().collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for (Integer digit : digitList) {
            resultList.add((int) Math.pow(digit, actualP++));
        }

        sum = resultList.stream().mapToInt(Integer::intValue).sum();

        if(sum % n == 0)
            return sum / n;
        else
              return -1;
    }

}
