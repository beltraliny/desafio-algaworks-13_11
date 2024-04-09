package com.github.beltraliny.tax;

public class NaturalPerson extends Entity {

    public static final double INCOME_TAX_RATE = 0.20;
    public static final double ANNUAL_INCOME_EXEMPTION = 50_000;

    private double annualIncome;

    public NaturalPerson(String name, double annualIncome) {
        super(name);
        this.annualIncome = annualIncome;
    }

    @Override
    public double calculateIncomeTax() {
        final double taxExemptValue = 0;
        if (getAnnualIncome() <= ANNUAL_INCOME_EXEMPTION) return taxExemptValue;

        return getAnnualIncome() * INCOME_TAX_RATE;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }
}
