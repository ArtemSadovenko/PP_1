package com.company;

import java.util.Scanner;

public class MyString {
    private int n;
    private String[] strings;

    public MyString(){
        n = 1;
        strings = new String[n];
    }

    public MyString(int amount){
        n = amount;
        strings = new String[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+" String: ");
            strings[i] = scanner.nextLine();
        }
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setStrings(int n, String str){
        strings[n] = str;
    }

    public int getN() {
        return n;
    }

    public String getStrings(int n) {
        return strings[n];
    }

    public void sort(){
        char a;
        int m = 0;
        String tmp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char: ");
        a = scanner.next().charAt(0);
        for (int i = 0; i < n; i++) {
            for (int j = m; j < n; j++) {
                if(amount(a, i) < amount(a, j) ){
                    tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
            }
            m++;
        }


    }

    public int amount(char ex, int n){
        String obj = strings[n];
        int amo = 0;
        for(int i = 0; i < obj.length(); i++){
            if(obj.charAt(i) ==  ex){
                amo++;
            }
        }
        return amo;
    }

    public void print(){
        for (int i = 0; i < n; i++) {
            System.out.println(strings[i]);
        }
    }
}
