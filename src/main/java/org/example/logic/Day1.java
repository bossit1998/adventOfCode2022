package org.example.logic;

import org.example.models.ElfInventory;
import org.example.utils.IOUtil;
import org.example.utils.MigrationUtil;

import java.util.List;

public class Day1 {

    public static void main(String[] args) {
        try {
            List<String> list = IOUtil.readFileIntoList("org/example/inputs/Day1");

            if (list == null) {
                System.out.println("Can't read from the file");
            } else {
                List<ElfInventory> elfInventoryList = MigrationUtil.migrateFromListIntoDTO(list);

                for (ElfInventory elfInventory : elfInventoryList) {

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
