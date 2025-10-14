package RedRover.school.Task8;

public class TaxPayment {

    String name;
    double taxPaymentSum;

    //пример с конструктором

    public TaxPayment(String name, double taxPaymentSum) {
        this.name = name;
        this.taxPaymentSum = taxPaymentSum;
    }

    public static TaxPayment allTaxPayment(Employee e) {
        double salary= e.salary;
        double taxPrecent=0;
        double taxableIncome = e.salary - e.numberOfKids * 1000;
        if (taxableIncome < 0) taxableIncome = 0;
        else {
            System.out.println(e.name + " нет детей");
        }
        if (salary > 10000) {
            taxPrecent=0.23;
        }
        if (salary >= 5000 && salary <= 10000) {
            taxPrecent=0.18;
        }
        if (salary < 5000 && salary>0) {
            taxPrecent=0.13;
        }
        return new TaxPayment(e.name,taxPrecent*taxableIncome);
    }
}