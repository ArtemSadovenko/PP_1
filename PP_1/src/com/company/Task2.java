package com.company;

public class Task2 {

    public static void main(String[] args) {
        String str = "minuteu";
        char ch = 'u';

        str = modify(str, ch);
        System.out.println(str);
    }

    public static String modify(String str, char ch){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch){
                res+=(str.charAt(i));
            }
        }
        return res;
    }
}
