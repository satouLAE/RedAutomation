package RedRover.school.Task12;

import static RedRover.school.Task12.ManagerHelper.printing;

public class Main {

    public static void printEmployer(Month[] months, Employee[] allEmployees) {
        for (Employee a : allEmployees) {
            for (Month m : months) {
                System.out.printf("Имя сотрудника %s, и он работал в месяц %s, а в сумме за все месяцы заработал %.2f \n",
                        a.getName(), m.getMonth(), SalaryUtils.getSalary(a, months));

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Month[] months = new MonthUtils().getMonthList();

        Worker[] workers = new Worker[]{
                new Worker(1000, "WorkerAlex"),
                new Worker(20000, "WorkerDiana")};

        // Создаем массив из нескольких месяцев для workers
        Month[] workerMonths = new Month[]{months[0], months[1]}; // январь и февраль


        printEmployer(workerMonths,workers);
        System.out.println("\n --------------------------------------");

        Manager[] managers = new Manager[]{
                new Manager(25000, "ManagerAlex", 3),
                new Manager(25000, "ManagerDiana", 5),
                new Manager(25000, "ManagerSultan", 0)
        };

        // Создаем массив из нескольких месяцев для workers
        Month[] managerMonths = new Month[]{months[0], months[1], months[2], months[3]}; // январь и февраль

        printEmployer(managerMonths,managers);

        Director[] directors = new Director[]{
                new Director(25000, "DirectorAlex", 3),
                new Director(25000, "DirectorDiana", 5),
                new Director(25000, "DirectorSultan", 0)
        };

        Month[] directorMonths = new Month[]{months[0], months[1]}; // январь и февраль

        printEmployer(directorMonths,directors);

        // Массив всех сотрудников
        Employee[] allEmployees = {
                workers[0], workers[1],
                managers[0], managers[1], managers[2],
                directors[0], directors[1], directors[2],

        };
        System.out.printf("Зарплата всех сотрудников = %.2f", SalaryUtils.getTotalSalary(allEmployees,months));

    }
}