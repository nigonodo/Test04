public class Employee implements Comparable<Employee> {
    private long id;
    private String name;
    private int age;
    private int salary;

    public Employee(long id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("ID. %d %s AGE %d zp %d\n",id,name,age,salary);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int compareTo(Employee o) {
        return salary-o.getSalary();
    }

}
