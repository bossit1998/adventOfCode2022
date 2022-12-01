package org.example.models;

import java.util.List;

public class ElfInventory {
    private List<Integer> calories;

    public List<Integer> getCalories() {
        return this.calories;
    }

    public void setCalories(List<Integer> calories) {
        this.calories = calories;
    }

    public void addCalorie(Integer calorie) {
        this.calories.add(calorie);
    }

    public void clearCalories() {
        this.calories.clear();
    }

    public Integer findSummation() {
        Integer sum = 0;
        for (Integer calorie : calories) {
            sum+=calorie;
        }
        return sum;
    }
}
