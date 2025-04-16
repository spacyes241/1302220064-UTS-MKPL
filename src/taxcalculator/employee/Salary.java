/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculator.employee;

/**
 *
 * @author Farrel Haykal
 */
public class Salary {
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;

    public void setSalary(int grade, boolean isForeigner) {
       int baseSalary = 0;
    switch (grade) {
    case 1:
        baseSalary = 3000000;
        break;
    case 2:
        baseSalary = 5000000;
        break;
    case 3:
        baseSalary = 7000000;
        break;
    default:
        baseSalary = 0;
}

        monthlySalary = isForeigner ? (int) (baseSalary * 1.5) : baseSalary;
    }

    public void setOtherMonthlyIncome(int income) {
        this.otherMonthlyIncome = income;
    }

    public void setAnnualDeductible(int deductible) {
        this.annualDeductible = deductible;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }
}