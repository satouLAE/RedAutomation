package RedRover.school.Task12;

public abstract class Employee {

    private double baseSalary;
    private String name;


    //пример с конструктором
    public Employee (double baseSalary, String name)
    {
        this.baseSalary=baseSalary;
        this.name=name;
    }

    public void setBaseSalary(double BaseSalary)
    {
        this.baseSalary = BaseSalary;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSalary();

}