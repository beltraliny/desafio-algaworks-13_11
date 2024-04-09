package com.github.beltraliny.tax;

public abstract class LegalEntity extends Entity {

    private double annualRevenue;
    private double annualExpenses;

    public LegalEntity(String name, double annualRevenue, double annualExpenses) {
        super(name);
        this.annualRevenue = annualRevenue;
        this.annualExpenses = annualExpenses;
    }

    public double getAnnualProfit() {
        return getAnnualRevenue() - getAnnualExpenses();
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public double getAnnualExpenses() {
        return annualExpenses;
    }
}
