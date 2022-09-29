package com.company;

public class BasicObject {
    protected boolean isSet;

    public boolean get_isSet() {
        return isSet;
    }

    public void set_isSet(boolean set) {
        isSet = set;
    }

    public BasicObject(boolean isSet) {
        this.isSet = isSet;
    }

    public BasicObject() {
        this.isSet = false;
    }
}
