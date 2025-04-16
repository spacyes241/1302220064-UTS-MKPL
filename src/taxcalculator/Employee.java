package taxcalculator;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;
  

import java.time.LocalDate;

public class Employee {
    private String employeeId;
    /* menambahkan personal info untuk meghindari badsmells data-clumps*/
    private PersonalInfo personalInfo;
    private LocalDate joinDate;
    private boolean isForeigner;
    /* menambahkan class gender untuk menghindari bad smells primitive-obsession  */
    private Gender gender;
    private Salary salary;
    private Family family;

    public Employee(String employeeId, PersonalInfo personalInfo, LocalDate joinDate, boolean isForeigner, Gender gender) {
        this.employeeId = employeeId;
        this.personalInfo = personalInfo;
        this.joinDate = joinDate;
        this.isForeigner = isForeigner;
        this.gender = gender;
        this.salary = new Salary();
        this.family = new Family();
    }

    public void setMonthlySalary(int grade) {
        salary.setSalary(grade, isForeigner);
    }

    public void setAnnualDeductible(int deductible) {
        salary.setAnnualDeductible(deductible);
    }

    public void setAdditionalIncome(int income) {
        salary.setOtherMonthlyIncome(income);
    }

    public void setSpouse(String name, String idNumber) {
        family.setSpouse(new Spouse(name, idNumber));
    }

    public void addChild(String name, String idNumber) {
        family.addChild(new Child(name, idNumber));
    }

    public int getAnnualIncomeTax() {
        int workingMonths = joinDate.getYear() == LocalDate.now().getYear()
                ? LocalDate.now().getMonthValue() - joinDate.getMonthValue()
                : 12;
        return TaxCalculator.calculateAnnualTax(salary, workingMonths, family);
    }
}
 