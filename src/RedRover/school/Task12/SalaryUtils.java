package RedRover.school.Task12;

import java.util.ArrayList;
import java.util.Arrays;

public class SalaryUtils {

    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double totalSalary = 0;

        for (Employee employee : employees) {
            for (Month month : months) {
                // Зарплата за месяц = дневная зарплата × количество рабочих дней
                double monthlySalary = employee.getSalary() * month.getWorkingDays();
                totalSalary += monthlySalary;
            }
        }

        return totalSalary;
    }

    public static double getSalary(Employee employees, Month[] months) {
        double salary = 0;
            for (Month month : months) {
                // Зарплата за месяц = дневная зарплата × количество рабочих дней
                double monthlySalary = employees.getSalary() * month.getWorkingDays();
                salary += monthlySalary;
            }

        return salary;
    }

}