package com.github.beltraliny.tax;

public class TaxManager {

    private double totalTaxesAmount;

    public void add(Entity entity) {
        this.totalTaxesAmount += entity.calculateIncomeTax();
    }

    public double getTotalTaxesAmount() {
        return totalTaxesAmount;
    }
}
