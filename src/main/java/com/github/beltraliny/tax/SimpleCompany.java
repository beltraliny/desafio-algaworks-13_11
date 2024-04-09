package com.github.beltraliny.tax;

public class SimpleCompany extends LegalEntity {

    public static final double REVENUE_TAX_RATE = 0.06;

    public SimpleCompany(String name, double annualRevenue, double annualExpenses) {
        super(name, annualRevenue, annualExpenses);
    }

    @Override
    public double calculateIncomeTax() {
        return getAnnualRevenue() * REVENUE_TAX_RATE;
    }
}
