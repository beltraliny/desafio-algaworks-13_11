package com.github.beltraliny;

import com.github.beltraliny.tax.NaturalPerson;
import com.github.beltraliny.tax.TaxManager;

public class Test {

    public static void main(String[] args) {
        TaxManager taxManager = new TaxManager();

        NaturalPerson john = new NaturalPerson("John Doe", 45_000);
        NaturalPerson jane = new NaturalPerson("Jane Doe", 180_000);

        taxManager.add(john);
        taxManager.add(jane);

        System.out.printf("Total taxes: %.2f%n", taxManager.getTotalTaxesAmount());
    }
}
