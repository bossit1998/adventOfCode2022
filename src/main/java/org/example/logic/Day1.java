package org.example.logic;

import org.example.models.ElfInventory;
import org.example.utils.IOUtil;
import org.example.utils.MigrationUtil;
import org.example.utils.Util;

import java.util.List;

public class Day1 {

    public static void main(String[] args) {
        try {

            String filePath = "C:\\Users\\HP\\IdeaProjects\\adventOfCode2022\\src\\main\\java\\org\\example\\inputs\\Day1";
            List<String> list = IOUtil.readFileIntoList(filePath);

            if (list == null) {
                System.out.println("Can't read from the file");
            } else {
                List<ElfInventory> elfInventoryList = MigrationUtil.migrateFromListIntoDTO(list);

                Integer max = Util.findMax(elfInventoryList,1);
                Integer max3 = Util.findMax(elfInventoryList,3);
                System.out.println("max is = " + max);
                System.out.println("max3 is = " + max3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
