package com.company;

public class Task10 {
    public static void main(String[] args) {
        boolean isDone;
        House house = new House(true,true,
                                true,true,
                                true,true,
                               true,true,
                                true,false);
        isDone =house.isRenovationComplete();
        house.floor.setFloorCleaner(true);
        System.out.println();
        isDone =house.isRenovationComplete();
    }
}
