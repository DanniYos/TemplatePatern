package org.example.services;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon and sugar");
    }

    @Override
    public String toString() {
        return "Tea";
    }
}
