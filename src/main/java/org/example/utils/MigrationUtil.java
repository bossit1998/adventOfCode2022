package org.example.utils;

import org.example.models.ElfInventory;

import java.util.ArrayList;
import java.util.List;

public class MigrationUtil {

    public static List<ElfInventory> migrateFromListIntoDTO(List<String> caloriesList) {
        List<ElfInventory> elfInventoryList = new ArrayList<>();

        for (String calorie : caloriesList) {
            ElfInventory elf = new ElfInventory();

            if (calorie.equals("\n")) {
                elfInventoryList.add(elf);
                elf.clearCalories();
            } else {
                elf.addCalorie(Integer.valueOf(calorie));
            }
        }

        return elfInventoryList;
    }
}
