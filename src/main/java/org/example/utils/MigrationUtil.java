package org.example.utils;

import org.example.models.ElfInventory;

import java.util.ArrayList;
import java.util.List;

public class MigrationUtil {

    public static List<ElfInventory> migrateFromListIntoDTO(List<String> caloriesList) {
        List<ElfInventory> elfInventoryList = new ArrayList<>();

        ElfInventory elf = new ElfInventory();

        for (String calorie : caloriesList) {
            if (calorie.equals("\n") || calorie.equals("")) {
                elf.setSum(null);
                elfInventoryList.add(elf);
                elf = new ElfInventory();
            } else {
                elf.addCalorie(Integer.valueOf(calorie));
            }
        }

        return elfInventoryList;
    }
}
