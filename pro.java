import java.util.*;

// Base Class
class Employee {
    String name;
    int employeeId;
    double basicSalary;

    // Constructor
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to be overridden
    double calculateSalary() {
        return basicSalary;
    }
}

// Manager Class
class Manager extends Employee {

    Manager(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (0.20 * basicSalary);
    }
}

// Developer Class
class Developer extends Employee {

    Developer(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (0.10 * basicSalary);
    }
}

// Intern Class
class Intern extends Employee {

    Intern(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary;
    }
}

// Main Class
public class pro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of employees

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double basicSalary = sc.nextDouble();
            String role = sc.next();

            Employee emp = null;

            if (role.equals("Manager")) {
                emp = new Manager(id, name, basicSalary);
            } 
            else if (role.equals("Developer")) {
                emp = new Developer(id, name, basicSalary);
            } 
            else if (role.equals("Intern")) {
                emp = new Intern(id, name, basicSalary);
            }

            // Printing output
            System.out.println(emp.employeeId + " " +
                               emp.name + " " +
                               role + " " +
                               emp.calculateSalary());
        }

        sc.close();
    }
}