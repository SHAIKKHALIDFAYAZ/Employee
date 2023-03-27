public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Khalid", "Banglore", 25000, 23);
        Employee employeeTwo = new Employee("Sai", "Hyderabad", 250000, 23);
        employeeTwo.raiseSalary();
        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);
    }
    }