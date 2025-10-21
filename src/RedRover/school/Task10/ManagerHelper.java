package RedRover.school.Task10;

public class ManagerHelper {
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

}