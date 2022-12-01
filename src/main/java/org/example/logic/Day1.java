package org.example.logic;

import org.example.models.ElfInventory;
import org.example.utils.IOUtil;
import org.example.utils.MigrationUtil;

import java.util.List;

public class Day1 {

    public static void main(String[] args) {
        try {
            List<String> list = IOUtil.readFileIntoList("D:\\Abdubosit\\projects\\IdeaProjects\\AdventOfCode2022\\src\\main\\java\\org\\example\\inputs\\Day1");

            if (list == null) {
                System.out.println("Can't read from the file");
            } else {
                List<ElfInventory> elfInventoryList = MigrationUtil.migrateFromListIntoDTO(list);

                Integer max = elfInventoryList.get(0).getSum();
                for (ElfInventory elfInventory : elfInventoryList) {
                    if (max<elfInventory.getSum()) {
                        max=elfInventory.getSum();
                    }
                }
                System.out.println("max is = " + max);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
