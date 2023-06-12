import java.util.Scanner;

class Employee {
    private int eNo;
    private String eName;
    private double eSalary;

    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public int getEno() {
        return eNo;
    }

    public String getEname() {
        return eName;
    }

    public double getEsalary() {
        return eSalary;
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Employee[] employees = new Employee[n];

        // Read employee information
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Employee Name: ");
            String eName = scanner.nextLine();
            System.out.print("Employee Salary: ");
            double eSalary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            employees[i] = new Employee(eNo, eName, eSalary);
        }

        // Search for an employee by employee number
        System.out.print("Enter the employee number to search: ");
        int searchEno = scanner.nextInt();

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getEno() == searchEno) {
                System.out.println("Employee Found:");
                System.out.println("Employee Number: " + emp.getEno());
                System.out.println("Employee Name: " + emp.getEname());
                System.out.println("Employee Salary: " + emp.getEsalary());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
