import java.util.*;
import com.employee.model.*;
import com.employee.service.*;

class EmployeeWageMain {

    private static Map<Integer,Employee> employees = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static EmployeeWageServices empImp = new EmployeeWageServiceImpl();
     
    public static void main(String[] args) { 
        System.out.println("Welcome to Employee Wage Computation Application...");

        int choice;

        do{
            System.out.println("1. Add Employee");
            System.out.println("2. Calculate Employee Wages");
            System.out.println("3. View Employee Details");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> calculateWage();
                case 3 -> displayEmployeeDetails();
                default -> System.out.println("Exiting Program..");
            }
        }while(choice != 4);
    }

    
    //calculating wages of employee
    private static void calculateWage() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        Employee emp = employees.get(id);
        if (emp == null) {
            System.out.println("Employee not found");
            return;
        }
        empImp.calculateWage(emp);
        System.out.println("Wage calculated successfully");
    }

    //adding employee
    private static void addEmployee() {
        System.out.print("Enter the Employee Id: ");
        int id = scanner.nextInt();
        employees.put(id, new Employee(id));
        System.out.println("Employee Added Successfully...");
    }

    //Displaying
    private static void displayEmployeeDetails() {

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        Employee emp = employees.get(id);
        if (emp == null) {
            System.out.println("Employee not found");
            return;
        }

        System.out.println("Employee ID        : " + emp.getEmployeeId());
        System.out.println("Working Days       : " + emp.getTotalWorkingDays());
        System.out.println("Working Hours      : " + emp.getTotalWorkingHours());
        System.out.println("Total Monthly Wage : " + emp.getTotalWage());
    }


}