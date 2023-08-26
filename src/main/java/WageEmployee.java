public class WageEmployee extends Employee {
    private double hourWage;
    //that based on minHourWage; (cannot be less)
    private int hours;
    //that based on maxHours; (cannot be more)


    public WageEmployee(int id, String name, int age, double hourWage, int hours) {
        super(id, name, age);
        if(hourWage > Salary.minHourWage)
        this.hourWage = hourWage;
        if(hours < Salary.maxHours)
        this.hours = hours;
    }

    public double getHourWage() {
        return hourWage;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public double calcSalary() {
        return hours* hourWage;
    }

    @Override
    public String toString() {
        return super.toString() + calcSalary();
    }
}
