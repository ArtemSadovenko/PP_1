package com.company;

import java.util.Objects;

public class House {
    Roof roof;
    Walls walls;
    Windows windows;
    Doors doors;
    Floor floor;

    public House(boolean riS, boolean rCS, boolean wiS,  boolean wiP, boolean diS, boolean dLS,
                 boolean wniS, boolean wniC, boolean fiS, boolean fiC ){
        roof = new Roof();
        roof.isSet = riS;
        roof.isRoofChimnaySet = rCS;

        walls = new Walls();
        walls.isWallsPainted = wiP;
        walls.isSet = wiS;

        doors = new Doors(true, true);
        doors.isLockSet = dLS;
        doors.isSet = diS;

        windows = new Windows();
        windows.isSet = wniS;
        windows.isWindowsClean = wniC;

        floor = new Floor();
        floor.isSet = fiS;
        floor.isFloorCleaner = fiC;
    }
    public  boolean isRenovationComplete(){
        int res = 0;
        System.out.println("Floor is set: " + floor.isSet);
        if(floor.isSet){res++;}

        System.out.println("Floor is cleaned: " + floor.isFloorCleaner);
        if(floor.isFloorCleaner){res++;}

        System.out.println("Roof is set: "+ roof.isSet);
        if(roof.isSet){res++;}

        System.out.println("Roof Chimnay is set: "+ roof.isRoofChimnaySet);
        if(roof.isRoofChimnaySet){res++;}

        System.out.println("Walls is set: "+ walls.isSet);
        if(walls.isSet){res++;}

        System.out.println("Walls is painted: "+ walls.isWallsPainted);
        if(walls.isWallsPainted){res++;}

        System.out.println("Doors is set: " + doors.isSet);
        if(doors.isSet){res++;}

        System.out.println("Doors locks is set: " + doors.isLockSet);
        if(doors.isLockSet){res++;}

        System.out.println("Windows is set: "+ windows.isSet);
        if(windows.isSet){res++;}

        System.out.println("Windows is cleaned: "+ windows.isWindowsClean);
        if(windows.isWindowsClean){res++;}

        System.out.println("Progress: " + (double)res/10.0* 100 + "%%");
        if(res == 10){
            System.out.println("Renovation complete");
            return true;
        }
        else{
            System.out.println("Renovation non complete");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(roof, house.roof) && Objects.equals(walls, house.walls) && Objects.equals(windows, house.windows) && Objects.equals(doors, house.doors) && Objects.equals(floor, house.floor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roof, walls, windows, doors, floor);
    }
}
