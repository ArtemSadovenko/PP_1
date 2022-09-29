package com.company;

public class Task6 {
    public static void main(String[] args) { //User
        User user_1 = new User("Jack", "Mill", "Jack@gmail.com", 23);
        //User user_2 = new User("Roy", "Mill", "Jack@gmail.com", 23);
        User user_2 = new User(1);


        System.out.println(user_1.equals(user_1));
        System.out.println(user_1.equals(user_2));

        System.out.println(user_1.hashCode());
        System.out.println(user_2.hashCode());

    }
}
