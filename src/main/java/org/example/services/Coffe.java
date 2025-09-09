package org.example.services;

public class Coffe extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Coffee and Sugar");
    }

    @Override
    public String toString() {
        return "Coffee";
    }
}
