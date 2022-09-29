package com.company;

import java.util.Objects;
import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public User(){
        firstName = "";
        lastName = "";
        email = "";
        age = 0;
    }

    public User(int a){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();

        System.out.println("Enter email: ");
        email = scanner.nextLine();

        System.out.println("Enter age: ");
        age = scanner.nextInt();
    }

    public User(String fname, String lname , String email_, int age_){
        firstName = fname;
        lastName = lname;
        email = email_;
        age = age_;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, email);
    }


}