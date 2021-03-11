package kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutlier{
    static int find(int[] integers) {

        List<Integer> list = Arrays.stream(integers).boxed().collect(Collectors.toList());
        List<Integer> evens = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        List<Integer> odds = list.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());

        return evens.size() == 1 ? evens.get(0) : odds.get(0);
    }
}