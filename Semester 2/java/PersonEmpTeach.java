import java.util.Scanner;

class Person {
    protected String name;
    protected String gender;
    protected String address;
    protected int age;
    
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    protected int empId;
    protected String companyName;
    protected String qualification;
    protected double salary;
    
    public Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    protected String subject;
    protected String department;
    protected int teacherId;
    
    public Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }
    
    public void display() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        
    }
}

public class PersonEmpTeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no. of teachers: ");
        int numTeachers = sc.nextInt();
        
        Teacher[] teachers = new Teacher[numTeachers];
        
        for (int i = 0; i < numTeachers; i++) {
            sc.nextLine(); // Consume the newline character
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            
            System.out.print("Address: ");
            String address = sc.nextLine();
            
            System.out.print("Age: ");
            int age = sc.nextInt();
            
            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            
            sc.nextLine(); // Consume the newline character
            
            System.out.print("Company Name: ");
            String companyName = sc.nextLine();
            
            System.out.print("Qualification: ");
            String qualification = sc.nextLine();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            sc.nextLine(); // Consume the newline character
            
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            
            System.out.print("Department: ");
            String department = sc.nextLine();
            
            System.out.print("Teacher ID: ");
            int teacherId = sc.nextInt();
            
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
        }
        
        //sc.close();
        
        System.out.println("\nTeacher Details:");
        
        for (Teacher teacher : teachers) {
            teacher.display();
        }
    }
}
