package com.company;

public class Task8 {
    public static void main(String[] args) { // CustomDouble
        CustomDouble a = new CustomDouble(12, 0.342);
        CustomDouble b= new CustomDouble(15, 0.152);
        CustomDouble c= new CustomDouble(15, 0.355);
        CustomDouble d= new CustomDouble();

        a.print();
        b.print();
        c.print();

        d = a.sum(b);
        d.print();

        d = a.minus(b);
        d.print();

        System.out.println(b.equals(c));
        System.out.println(a.no_equals(b));
        System.out.println(a.bigger(b));
        System.out.println(a.bigger_or_equal(b));
        System.out.println(a.less(b));
        System.out.println(a.less_or_equal(b));

        System.out.println(a.hashCode());
    }
}
