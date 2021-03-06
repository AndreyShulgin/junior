package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int index = 0;
        int[][] array = new int[rows][cells];
        for (var out : array) {
            for (int in = 0; in != cells; in++) {
                if (index != list.size()) {
                    out[in] = list.get(index++);
                }
            }
        }
        return array;
    }

    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] out : list) {
            for (int in = 0; in != out.length; in++) {
                result.add(out[in]);
            }
        }
        return result;
    }
}
