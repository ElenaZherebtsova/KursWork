
public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;

    public static int idCounter = 1;

    public Employee(String fullName, int salary, int department) {
        this.id = idCounter;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        idCounter++;
    }


    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return this.fullName + " получает в месяц " + this.salary + "руб. и работает в отделе №" + this.department;
    }


}
