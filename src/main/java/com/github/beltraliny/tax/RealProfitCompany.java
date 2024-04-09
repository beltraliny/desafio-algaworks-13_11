package com.github.beltraliny.tax;

public class RealProfitCompany extends LegalEntity {

    public static final double PROFIT_TAX_RATE = 0.25;

    public RealProfitCompany(String name, double annualRevenue, double annualExpenses) {
        super(name, annualRevenue, annualExpenses);
    }
    @Override
    public double calculateIncomeTax() {
        return getAnnualProfit() * PROFIT_TAX_RATE;
    }
}
