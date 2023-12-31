abstract class Employee {

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calcSalary();
    public String toString(){
        return id + " " + name + " " + age + " ";
    }


}
