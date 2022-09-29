package com.company;

public class Check {
    Pair []pair;
    int k;

    public void print(){
        double sum = 0;
        for (int i = 0; i < k; i++) {
            System.out.println(pair[i].getProduct().getName()+"    "+
                                pair[i].getAmount() +"   "+
                                pair[i].getProduct().getCost());
            sum+= pair[i].getProduct().getCost();
        }
        System.out.println("Final sum: "+ sum);
    }

    public Check(){
        k = 1;
        pair = new Pair[k];
        pair[k].product = new Product();
        pair[k].amount = 0;
    }

    public Check(int k){
        this.k = k;
        pair = new Pair[k];
        for (int i = 0; i < k; i++) {
            pair[i] = new Pair(1);
        }
    }

}
