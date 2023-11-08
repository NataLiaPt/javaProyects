package inheritance;

public class Employee extends Person{
    private int id;
    private double salary;
    private static int EmployeeCounter;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String detail() {
        return super.detail() + " Salary: " + this.salary;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("id=").append(id);
        sb.append(", salary=").append(salary);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
