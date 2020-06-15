package exer2;

public class BasePlusComissionEmployee {
    private double baseSalary;
    private ComissionEmployee comissionEmployee;

    public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
    double comissionRate, double baseSalary) {
        comissionEmployee = new ComissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
        setBaseSalary(baseSalary);
    }
    
    public double earnings() {
        return comissionEmployee.earnings() + getBaseSalary();
    }

    @Override
    public String toString() {
        return  comissionEmployee.toString() + ", baseSalary=" + getBaseSalary(); 
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}