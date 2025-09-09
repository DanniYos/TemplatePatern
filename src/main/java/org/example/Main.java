package org.example;

import org.example.services.Coffe;
import org.example.services.Tea;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("================ HOW PREPARING TEA ? ================");
        Tea  myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println("<=============== HOW PREPARING COFFE? ================");
        Coffe coffe = new Coffe();
        coffe.prepareRecipe();
    }
}