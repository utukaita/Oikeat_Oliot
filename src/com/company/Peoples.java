package com.company;

import java.util.Objects;

public class Peoples {
    String color;
    int amount;
    double height;
    static String country = "the USA";
    static int id_counter = 0;
    int people_id;

    public Peoples(String color, int amount, double height) {
        this.color = color;
        this.amount = amount;
        this.height = height;
        people_id = id_counter++;

    }


    public String toString(){
        return "The " + color + " people of " + country + " with the people id (" + people_id + ") are " + amount +
                " and their average height is " + height + " meters.";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}


