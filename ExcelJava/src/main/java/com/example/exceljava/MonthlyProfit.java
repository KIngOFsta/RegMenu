package com.example.exceljava;

public class MonthlyProfit {
    private int year;
    private int month;
    private double profit;

    public MonthlyProfit(int year, int month, double profit) {
        this.year = year;
        this.month = month;
        this.profit = profit;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public double getProfit() {
        return profit;
    }
}
