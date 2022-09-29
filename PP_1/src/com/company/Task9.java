package com.company;

import java.util.Scanner;

public class Task9 { //CustomDouble
    public static void main(String[] args) {
        char control;
        CustomDouble arg_1;
        CustomDouble arg_2;
        CustomDouble res = new CustomDouble();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter argument 1: ");
        arg_1 = new CustomDouble(scanner.nextDouble());
        System.out.println("Enter argument 2: ");
        arg_2 = new CustomDouble(scanner.nextDouble());

        System.out.println("Choose option: '+' '-' '*' '/'");
        control = scanner.next().charAt(0);

        if(control =='+'){
            res = arg_1.sum(arg_2);
            System.out.println(res.toDouble());
        }
        else if(control =='-'){
            res = arg_1.minus(arg_2);
            System.out.println(res.toDouble());
        }
        else if(control == '*'){
            System.out.println(arg_1.toDouble()*arg_2.toDouble());
        }
        else if(control == '/'){
            System.out.println(arg_1.toDouble()/arg_2.toDouble());
        }
        else{
            System.out.println("Irregular input");
        }
    }
}
