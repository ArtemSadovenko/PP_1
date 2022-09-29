package com.company;

import java.util.Objects;

public class CustomDouble {
    private int int_;
    private double dobl;

    public int getInt_() {
        return int_;
    }

    public void setInt_(int int_) {
        this.int_ = int_;
    }

    public double getDobl() {
        return dobl;
    }

    public void setDobl(double dobl) {
        this.dobl = dobl;
    }

    public CustomDouble(){
        int_ = 0;
        dobl = 0;
    }

    public CustomDouble(double obj){
        int_ = (int)obj;
        dobl = obj - int_;
    }

    public CustomDouble( int i, double d){
        int_ = i+(int) d;
        dobl = d - (int) d;
    }

    public CustomDouble sum(CustomDouble obj){
        CustomDouble res;
        double tmp_1;
        double tmp_2;

        tmp_1 = this.int_ + this.dobl;
        tmp_2 = obj.int_ + obj.dobl;
        res = new CustomDouble(tmp_1+tmp_2);

        return res;
    }

    public CustomDouble minus(CustomDouble obj){
        CustomDouble res;
        double tmp_1;
        double tmp_2;

        tmp_1 = this.int_ + this.dobl;
        tmp_2 = obj.int_ + obj.dobl;
        res = new CustomDouble(tmp_1-tmp_2);

        return res;
    }

    public boolean bigger(CustomDouble obj){
        return this.int_ > obj.int_ || (this.int_ == obj.int_ && this.dobl > obj.dobl);
    }

    public boolean less(CustomDouble obj){
        return !(this.bigger(obj)) && !(this.equals(obj));
    }


    public boolean equals(CustomDouble obj) {
        CustomDouble that = (CustomDouble) obj;
        return int_ == that.int_ && Double.compare(that.dobl, dobl) == 0;
    }

    public boolean no_equals(CustomDouble obj){
        return !(this.equals(obj));
    }

    public boolean bigger_or_equal(CustomDouble obj){
        return this.bigger(obj) || this.equals(obj);
    }

    public boolean less_or_equal(CustomDouble obj){
        return this.less(obj) || this.equals(obj);
    }

    public void print(){
        double tmp = int_+dobl;
        System.out.println(tmp);
    }

    public double toDouble(){
        double obj = int_+ dobl;
        return obj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(int_, dobl);
    }


}
