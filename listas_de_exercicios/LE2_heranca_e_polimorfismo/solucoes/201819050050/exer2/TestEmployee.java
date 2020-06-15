package exer2;
public class TestEmployee {
    public static void main(String[] args) {
        //  ComissionEmployee comissionEmployee = new ComissionEmployee("Sue", "Jones", "333", 10000, .06);
        ComissionEmployee cEmployee = new ComissionEmployee("Jony", "Ive", "333", 10000, .075);
        BasePlusComissionEmployee basePlusComissionEmployee = new BasePlusComissionEmployee("Craig", "Frederick", "333", 10000, .065, 500);
        
        System.out.println(cEmployee.toString());
        System.out.println(cEmployee.earnings());
        System.out.println(basePlusComissionEmployee.toString());
        System.out.println(basePlusComissionEmployee.earnings());
    }
}