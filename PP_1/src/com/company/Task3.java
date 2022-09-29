package com.company;

public class Task3 {
    public static void main(String[] args) {
        int f_r;
        int f;

        f_r = factorial_rec(6, 1, 1);
        System.out.println(f_r);

        f = factorial(6);
        System.out.println(f);
    }

    public static int factorial(int a){
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b*=i;
        }
        return b;
    }

    public static int factorial_rec(int a, int res, int i){
        if(i <= a){
            res*=i;
            i++;
            return factorial_rec(a, res, i++);
        }
        else{
            return res;
        }
    }
}