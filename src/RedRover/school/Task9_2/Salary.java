package RedRover.school.Task9_2;

import RedRover.school.Task9_2.Employee;

public class Salary {

    public static double getSum(Employee[] employeeArray) {
        double sum = 0;

        for (Employee e:employeeArray) {
            sum+=e.salary;

        }
        return sum;
    }
}