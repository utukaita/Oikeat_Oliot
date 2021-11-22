package com.company;

public class Newspaper {
    String name;
    int year;
    int month;
    int dayOfMonth;
    boolean isFinnish;

    public Newspaper(String name, int year, int month, int dayOfMonth, boolean isFinnish) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }
    public void setDate(int year, int month, int dayOfMonth){
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", dayOfMonth=" + dayOfMonth +
                ", isFinnish=" + isFinnish +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public boolean isFinnish() {
        return isFinnish;
    }
}
