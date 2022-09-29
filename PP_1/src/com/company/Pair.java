package com.company;

import java.util.Scanner;

public class Pair {
    Product product;
    int amount;


    public Pair(String name, int amount, int cost){
        product = new Product(name, cost);
        this.amount = amount;
    }

    public Pair(){
        product = new Product();
        amount = 0;
    }

    public Pair(int a){
        Scanner scanner = new Scanner(System.in);
        product = new Product();

        System.out.println("Name: ");
        product.setName(scanner.nextLine());
        System.out.println("Cost: ");
        product.setCost(scanner.nextDouble());
        System.out.println("Amount: ");
        amount = scanner.nextInt();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }
}
