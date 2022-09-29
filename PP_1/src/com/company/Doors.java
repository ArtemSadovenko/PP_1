package com.company;

public class Doors extends BasicObject{
    protected boolean isLockSet;

    public boolean get_isLockSet() {
        return isLockSet;
    }

    public void set_isLockSet(boolean lockSet) {
        isLockSet = lockSet;
    }

    public Doors(boolean is_set, boolean is_LockSet){
        isSet = is_set;
        isLockSet = is_LockSet;
    }

}
