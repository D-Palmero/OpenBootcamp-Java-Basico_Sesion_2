package com.ejercicio2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double price = 29.99;

        System.out.println(calculateIVA(price));
    }

    private static double calculateIVA(double price) {
        double iva = 0.21;
        return (price + iva * price);
    }
}
