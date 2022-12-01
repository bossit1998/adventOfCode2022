package org.example.utils;

import org.example.models.ElfInventory;

import java.util.Collections;
import java.util.List;

public class Util {

    public static Integer findMax(List<ElfInventory> list, Integer numberOfMaxes) {
        Integer sum = 0;

        list.sort((o1, o2) -> o2.getSum().compareTo(o1.getSum()));

        for (int i=0; i<numberOfMaxes; i++) {
            sum+=list.get(i).getSum();
        }
        return sum;
    }

}
