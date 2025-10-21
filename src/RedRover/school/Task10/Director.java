package RedRover.school.Task10;

public class Director extends Manager{


    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }


    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() * ((double) getNumberOfSubordinates() / 100 * 9);
        } else {
            return getBaseSalary();
        }
    }

}