package RedRover.school.Task9_2;

public class Employee {

    String name;
    int age;
    String sex;
    double salary;

    //пример с конструктором
    public Employee(String name, int age, String sex, double salary)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.salary=salary;

    }

    public boolean isSameName(Employee employee)
    {

        return this.name.equals(employee.name);
    }

}