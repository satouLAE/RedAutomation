package RedRover.school.Task9_2;

import RedRover.school.Task9_2.Employee;
import RedRover.school.Task9_2.Person;
import RedRover.school.Task9_2.Salary;

public class Main {
    public static void printing(Employee[] employees)
    {
        for (Employee e:employees) {
            System.out.println("Имя "+ e.name+ " Зарплата "+e.salary);

        }
    }
    public static void main(String[] args) {
        //Первое задание
        Person person1= new Person();
        person1.age=20;
        Person person2= new Person();
        person2.age=25;
        System.out.println(person2.getName("women", "Diana")+ "\nВозраст: "+person2.age);

        //второе задание
        System.out.println("Имена одинаковые?");
        Employee e1=new Employee("Steeve",32,"man",8000);
        Employee e2=new Employee("Marte",25,"woman",28000);
        System.out.println(e1.isSameName(e1));

        //третье задание
      System.out.println("Все сотрудники ");
        printing(new Employee[]{e2, e1});
        System.out.println("Сумма всех зарплат "+ Salary.getSum(new Employee[] {e1,e2}));



    }
}