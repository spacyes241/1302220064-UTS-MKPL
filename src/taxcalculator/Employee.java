package taxcalculator;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;


import java.time.LocalDate;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;

    private LocalDate joinDate;
    private boolean isForeigner;
    private boolean gender; //true = Laki-laki, false = Perempuan
    private Salary salary;
    private Family family;
        
	

    public Employee(String employeeId,String firstName, String lastName, String idNumber, String address, LocalDate joinDate, boolean isForeigner, boolean gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
	this.lastName = lastName;
	this.idNumber = idNumber;		
        this.address = address;
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
