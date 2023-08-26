public class MainEmployee {

    public static void main(String[] args) {

        WageEmployee we1 = new WageEmployee(2, "Alice", 25, 36, 470);;
        WageEmployee we2 = new WageEmployee(5, "Mike", 22, 40, 220);
        SalaryEmployee se1 = new SalaryEmployee(1, "John", 30, 7000);
        SalaryEmployee se2 = new SalaryEmployee(4, "Eva", 28, 5500);
        Manager m1 = new Manager(3, "Bob", 40, 10000, 0.2);
        Manager m2 = new Manager(6, "Sarah", 35, 9000, 0.1);

        Employee[] e = new Employee[10];
        e[0] = we1;
        e[1] = we2;
        e[2] = se1;
        e[3] = se2;
        e[4] = m1;
        e[5] = m2;






    print(e);
    }

    public static void print(Employee[] e){
        for (int i = 0; e[i] != null; i++){
            System.out.println("Employee" + (i+1) + " " + e[i].calcSalary());
        }
    }

}
