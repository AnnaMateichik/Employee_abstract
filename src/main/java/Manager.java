public class Manager extends SalaryEmployee{

    private double bonuses;
    //that based on maxBonuses; (cannot be more)


    public Manager(int id, String name, int age, double salary, double bonuses) {
        super(id, name, age, salary);
        if(bonuses < Salary.maxBonuses)
        this.bonuses = bonuses;
    }


    public double getBonuses() {
        return bonuses;
    }

    @Override
    public double calcSalary() {
        return super.calcSalary() + super.calcSalary() * bonuses;
    }

    @Override
    public String toString() {
        return super.toString() +  " " + calcSalary();
    }
}
