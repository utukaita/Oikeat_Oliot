package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Peoples black = new Peoples("black", 10000000, 1.85);
        Peoples white = new Peoples("white", 200000000, 1.80);
        System.out.println(black);
        System.out.println(white);
    }
}

