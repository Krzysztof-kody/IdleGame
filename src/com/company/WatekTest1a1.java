package com.company;

import java.util.Scanner;

public class WatekTest1a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Watek1a1 w1 = new Watek1a1("Ala", 1000);
        w1.start();
        Watek1a1 w2 = new Watek1a1("ma", 800);
        w2.start();
    }
}
