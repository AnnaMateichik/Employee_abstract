public class SalaryEmployee extends Employee{
    private double salary;


    public SalaryEmployee(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calcSalary() {
        if (salary > Salary.minSalary){
            return this.salary;}
        return Salary.minSalary;
    }

    // should return salary that based on minSalary
    @Override
    public String toString() {
        return super.toString() + salary;
    }
}
