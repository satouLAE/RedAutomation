package RedRover.school.Task8;

public class Main {

    public static void printing(Employee[] employees)
    {
        for (Employee e:employees) {
            System.out.println("Имя "+ e.name+ " Зарплата "+e.salary);

        }
    }

    public static String converting(int value)
    {
        String[] words = {"ноль", "один", "два", "три", "четыре",
                "пять", "шесть", "семь", "восемь", "девять"};

        String s= String.valueOf(value);
        String result="";
        for (int i=0;i<s.length();i++)
        {
            result+=words[Character.getNumericValue(s.charAt(i))]+" ";
        }

        return result;
    }

    public static void main(String[] args) {
        //Первое задание
        Person person1= new Person();
        Person person2= new Person();
        person1.age=32;
        person1.sex="mAn";
        person1.name="Alex";
        person2.age=25;
        System.out.println(person1.getName(person1.sex, person1.name));
        System.out.println("Возраст: "+ person1.age);

        System.out.println(person2.getName("women", "Diana")+ "\nВозраст: "+person2.age);

        //второе задание
        Employee employee1=new Employee("Steeve", 11000,0);
        Employee employee3=new Employee("Mark", 5000,1);
        Employee employee2=new Employee("toManyChildren", 10000,11);

        TaxPayment taxPayment= TaxPayment.allTaxPayment(employee1);
        TaxPayment taxPayment2= TaxPayment.allTaxPayment(employee2);
        TaxPayment taxPayment3= TaxPayment.allTaxPayment(employee3);

        System.out.println("Налоговые выплаты у "+taxPayment.name + " равны "+ taxPayment.taxPaymentSum);
        System.out.println("Налоговые выплаты у "+taxPayment2.name + " равны "+ taxPayment2.taxPaymentSum);
        System.out.println("Налоговые выплаты у "+taxPayment3.name + " равны "+ taxPayment3.taxPaymentSum);

        //третье задание
        System.out.println("Все сотрудники ");
        printing(new Employee[]{employee1, employee2, employee3});
        System.out.println("Сумма всех зарплат "+ Salary.getSum(new Employee[] {employee1,employee2,employee3}));

        //третье четрые
        System.out.println(converting(163));

    }
}