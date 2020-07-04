package exer1;

public class ComissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double comissionRate;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
    double comissionRate) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
        setGrossSales(grossSales);
        setComissionRate(comissionRate);
    }
    

    public double earnings() {
        return getComissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return  "comissionRate="
                + getComissionRate() + ", firstName="
                + getFirstName() + ", lastName="
                + getLastName() + ", grossSales="
                + getGrossSales() + ", socialSecurityNumber=" 
                + getSocialSecurityNumber();
    }

    
    // Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

}