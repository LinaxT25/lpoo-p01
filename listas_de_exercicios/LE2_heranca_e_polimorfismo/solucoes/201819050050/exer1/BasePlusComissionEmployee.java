package exer1;

public class BasePlusComissionEmployee extends ComissionEmployee {
    private double baseSalary;

    public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
    double comissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
        setBaseSalary(baseSalary);
    }
    
    @Override
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    @Override
    public String toString() {
        return  super.toString() + ", baseSalary=" + getBaseSalary(); 
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}