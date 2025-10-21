package RedRover.school.Task10;

public class Main {
    public static void printing(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println("Имя " + e.getName() + " Зарплата " + e.getBaseSalary());

        }
    }

    public static void findPerson(Employee[] employees, String name) {
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name))
                System.out.println("Такой сотрудник найден " + e.getName());

        }
    }

    public static void findBySyblings(Employee[] employees, String name) {
        for (Employee e : employees) {
            if (e.getName().toLowerCase().contains(name.toLowerCase()))
                System.out.println("Такой сотрудник найден " + e.getName());

        }
    }

    public static double getSum(Employee[] employeeArray) {
        double sum = 0;

        for (Employee e : employeeArray) {
            sum += e.getBaseSalary();

        }
        return sum;
    }

    public static Employee minSalary(Employee[] employeeArray) {
        Employee min = employeeArray[0];

        for (Employee e : employeeArray) {
            if (min.getSalary() > e.getSalary()) {
                min.setBaseSalary(e.getSalary());
                min.setName(e.getName());
            }
        }
        return min;
    }

    public static Manager minSubordinates(Manager[] employeeArray) {
        Manager min = employeeArray[0];

        for (Manager e : employeeArray) {
            if (min.getNumberOfSubordinates() > e.getNumberOfSubordinates()) {
                min = e;
            }
        }
        return min;
    }

    public static String maxAllowances(Manager[] managers) {
        Manager m=managers[0];
        double maxBonus = Math.abs(m.getSalary() - m.getBaseSalary());
        for (Manager manager : managers) {
            double bonus = Math.abs(manager.getSalary() - manager.getBaseSalary());
            if (bonus > maxBonus) {
                maxBonus = bonus;
                m=manager;
            }
        }
        return maxBonus + " у менеджера с именем: " + m.getName();
    }

    public static String minAllowances(Manager[] managers) {
        Manager m=managers[0];
        double minBonus = Math.abs(m.getSalary() - m.getBaseSalary());
        for (Manager manager : managers) {
            double bonus = Math.abs(manager.getSalary() - manager.getBaseSalary());
            if (bonus < minBonus) {
                minBonus = bonus;
                m=manager;
            }
        }
        return minBonus + " у менеджера с именем: " + m.getName();
    }

    public static void Allowances(Manager[] managers) {
        for (Manager manager : managers) {
            double bonus = Math.abs(manager.getSalary() - manager.getBaseSalary());
            System.out.println(bonus + " у менеджера с именем: " + manager.getName() + " базовая ставка " + manager.getBaseSalary());
        }
    }

    public static Manager maxSubordinates(Manager[] employeeArray) {
        Manager max = employeeArray[0];

        for (Manager e : employeeArray) {
            if (max.getNumberOfSubordinates() < e.getNumberOfSubordinates()) {
                max = e;
            }
        }
        return max;
    }

    public static Employee maxSalary(Employee[] employeeArray) {
        Employee max = employeeArray[0];

        for (Employee e : employeeArray) {
            if (max.getSalary() < e.getSalary()) {
                max = e;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //поиск сотрудника в массиве по его имени
        Employee[] employees = new Employee[]{
                new Employee(10000, "Alex")};
        findPerson(employees, "Alex");

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
        findBySyblings(workers, "Alex");

        //третье задание Подсчет зарплатного бюджета для всех сотрудников в массиве
        System.out.println("Все сотрудники ");
        printing(employees);
        System.out.printf("Общая сумма: %.2f\n", getSum(employees));

        //третье задание поиск наименьшей зарплаты в массиве
        System.out.printf("Наименьшая зарплата %.2f у сотрудника %s\n", minSalary(allEmployees).getSalary(), minSalary(allEmployees).getName());

        //четвертое задание поиск наибольшей зарплаты в массиве
        System.out.printf("Наибольшая зарплата %.2f у сотрудника %s\n", maxSalary(allEmployees).getSalary(), maxSalary(allEmployees).getName());

        //пятое задание. поиск наименьшего количества подчиненных в массиве менеджеров
        System.out.printf("Наименьшее количество подчиненных %d у сотрудника %s\n", minSubordinates(managers).getNumberOfSubordinates(), minSubordinates(managers).getName());

        //шестое задание. поиск наибольшего количества подчиненных в массиве менеджеров
        System.out.printf("Наибольшее количество подчиненных %d у сотрудника %s\n", maxSubordinates(managers).getNumberOfSubordinates(), maxSubordinates(managers).getName());

        //седьмое задание. поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

        System.out.println("Все менеджеры");
        Allowances(managers);
        System.out.println("\nНаибольшая надбавка " + maxAllowances(managers));

        //седьмое задание. поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

        System.out.println("Наименьшая надбавка " + minAllowances(managers));

    }
}