class Member 
{
    String name;
    int age;
    String phone;
    String address;
    double salary;

    public void printSalary() 
    {
        System.out.println("Salary: " + salary);
    }
}
class Employee extends Member 
{
    String spec;
}

class Manager extends Member 
{
    String dept;
}
public class Program
{
    public static void main(String[] args) 
    {
        Employee e = new Employee();
        e.name = "Avipsa";
        e.age = 28;
        e.phone = "8895612041";
        e.address = "Bhubaneswar";
        e.salary = 70000.0;
        e.spec= "Front end Developer";

        Manager m = new Manager();
        m.name = "Animesh";
        m.age = 24;
        m.phone = "9953165421";
        m.address = "Mumbai";
        m.salary = 20000.0;
        m.dept = "Engineering";

        System.out.println("Employee Details:\nName: " + e.name + "\nAge: " + e.age + "\nPhone Number: " + e.phone + "\nAddress: " + e.address + "\nSalary: " + e.salary + "\nSpecialization: " + e.spec);
        System.out.println("Manager Details:\nName: " + m.name + "\nAge: " + m.age + "\nPhone Number: " + m.phone + "\nAddress: " + m.address + "\nSalary: " + m.salary+ "\nDepartment: " + m.dept);
    }
}