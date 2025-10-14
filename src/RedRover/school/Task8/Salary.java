package RedRover.school.Task8;

public class Salary {

    public static double getSum(Employee[] employeeArray) {
        double sum = 0;

        for (Employee e:employeeArray) {
            sum+=e.salary;

        }
        return sum;
    }
}