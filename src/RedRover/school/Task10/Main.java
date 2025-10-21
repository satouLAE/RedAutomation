package RedRover.school.Task10;

import static RedRover.school.Task10.ManagerHelper.printing;

public class Main {


    public static void main(String[] args) {
        //поиск сотрудника в массиве по его имени
        Employee[] employees = new Employee[]{
                new Employee(10000, "Alex")};
        ManagerHelper.findPerson(employees, "Alex");

        Worker[] workers = new Worker[]{
                new Worker(1000, "neAlex"),
                new Worker(20000, "Diana")};

        Manager[] managers = new Manager[]{
                new Manager(25000, "ManagerAlex", 3),
                new Manager(25000, "ManagerDiana", 5),
                new Manager(25000, "ManagerSultan", 0)
        };

        // Массив всех сотрудников
        Employee[] allEmployees = {employees[0],
                workers[0], workers[1],
                managers[0], managers[1], managers[2]
        };

        //второе задание поиск сотрудника в массиве по вхождению указанной строки в его имени
        ManagerHelper.findBySyblings(workers, "Alex");

        //третье задание Подсчет зарплатного бюджета для всех сотрудников в массиве
        System.out.println("Все сотрудники ");
        printing(employees);
        System.out.printf("Общая сумма: %.2f\n", ManagerHelper.getSum(employees));

        //третье задание поиск наименьшей зарплаты в массиве
        System.out.printf("Наименьшая зарплата %.2f у сотрудника %s\n", ManagerHelper.minSalary(allEmployees).getSalary(), ManagerHelper.minSalary(allEmployees).getName());

        //четвертое задание поиск наибольшей зарплаты в массиве
        System.out.printf("Наибольшая зарплата %.2f у сотрудника %s\n", ManagerHelper.maxSalary(allEmployees).getSalary(), ManagerHelper.maxSalary(allEmployees).getName());

        //пятое задание. поиск наименьшего количества подчиненных в массиве менеджеров
        System.out.printf("Наименьшее количество подчиненных %d у сотрудника %s\n", ManagerHelper.minSubordinates(managers).getNumberOfSubordinates(), ManagerHelper.minSubordinates(managers).getName());

        //шестое задание. поиск наибольшего количества подчиненных в массиве менеджеров
        System.out.printf("Наибольшее количество подчиненных %d у сотрудника %s\n", ManagerHelper.maxSubordinates(managers).getNumberOfSubordinates(), ManagerHelper.maxSubordinates(managers).getName());

        //седьмое задание. поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

        System.out.println("Все менеджеры");
        ManagerHelper.Allowances(managers);
        System.out.println("\nНаибольшая надбавка " + ManagerHelper.maxAllowances(managers));

        //седьмое задание. поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

        System.out.println("Наименьшая надбавка " + ManagerHelper.minAllowances(managers));

    }
}