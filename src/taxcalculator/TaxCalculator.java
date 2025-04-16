/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculator;

/**
 *
 * @author Farrel Haykal
 */
public class TaxCalculator {
    public static int calculateAnnualTax(Salary salary, int workingMonths, Family family) {
        int taxableIncome = (salary.getMonthlySalary() + salary.getOtherMonthlyIncome()) * workingMonths - salary.getAnnualDeductible();

        int nonTaxableIncome = 54000000;
        if (family.hasSpouse()) {
            nonTaxableIncome += 4500000;
        }
        nonTaxableIncome += 1500000 * family.getNumberOfChildren();

        int netTaxable = taxableIncome - nonTaxableIncome;
        return (int) Math.round(0.05 * Math.max(netTaxable, 0));
    }
}
