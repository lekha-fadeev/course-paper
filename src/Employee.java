public class Employee {
    // private field's
    private String FIO;
    private int Department;
    private int Salary;
    private static int Counter;
    private int Id;

    // Getter's
    public int getId() {
        return this.Id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.Department;
    }

    public int getSalary() {
        return this.Salary;
    }

    // Setter's
    public void SetFIO(String fio) {
        this.FIO = fio;
    }

    public void SetDepartment(int dept) {
        this.Department = dept;
    }

    public void SetSalary(int sal) {
        this.Salary = sal;
    }

    // Constructor
    public Employee(String fio, int dept, int salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id = ++Counter;
    }

    @Override
    public String toString() {
        return "Id: " + Id + " Fio: " + FIO + " Dept: " + Department + " Salary: " + Salary;
    }
}
