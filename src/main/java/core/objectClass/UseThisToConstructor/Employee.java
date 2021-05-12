package core.objectClass.UseThisToConstructor;

/**
 * @author: bamboo on 21/4/12
 * @description: _
 */

public class Employee {
    public String name;
    public double salary;
    public static int nextInt;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double s) {
        this("e" + nextInt, s);
    }
}
