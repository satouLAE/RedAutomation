package RedRover.school.Task12;

public final class Month {

    private final String month;
    private final int monthDays;
    private final int workingDays;

    public Month(String month, int monthDays, int workingDays) {
        this.month = month;
        this.monthDays = monthDays;
        this.workingDays = workingDays;
    }


    public String getMonth() {
        return month;
    }

    public int getMonthDays() {
        return monthDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }


}