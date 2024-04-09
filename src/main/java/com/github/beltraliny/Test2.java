package com.github.beltraliny;

import com.github.beltraliny.tax.NaturalPerson;
import com.github.beltraliny.tax.RealProfitCompany;
import com.github.beltraliny.tax.SimpleCompany;
import com.github.beltraliny.tax.TaxManager;

public class Test2 {

    public static void main(String[] args) {
        TaxManager taxManager = new TaxManager();

        NaturalPerson john = new NaturalPerson("John Doe", 45_000);
        NaturalPerson jane = new NaturalPerson("Jane Doe", 180_000);

        SimpleCompany pub = new SimpleCompany("Le Pub", 250_000, 160_000);
        RealProfitCompany codeCompany = new RealProfitCompany("Code Company", 8_000_000, 6_000_000);

        taxManager.add(john);
        taxManager.add(jane);
        taxManager.add(pub);
        taxManager.add(codeCompany);

        System.out.printf("Total taxes: %.2f%n", taxManager.getTotalTaxesAmount());
    }
}
