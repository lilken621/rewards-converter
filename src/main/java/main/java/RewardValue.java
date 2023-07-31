package main.java;

public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }

    // Conversion from miles to cash at a rate of 0.0035
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }

    // Conversion from cash to miles at a rate of 0.0035
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }
}

