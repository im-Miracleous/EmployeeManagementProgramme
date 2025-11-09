import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EmployeeApp {
    private List<Employee> employees;

    public EmployeeApp() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void showAllEmployees(Role role) {
        for (Employee employee : employees) {
            if (role == Role.ALL) {
                System.out.println(employee.toString());
            }
            else if (role == Role.PROGRAMMER && employee instanceof Programmer) {
                System.out.println(employee.toString());
            }
            else if (role == Role.PM && employee instanceof ProjectManager) {
                System.out.println(employee.toString());
            }
            else if (role == Role.CS && employee instanceof CleaningService) {
                System.out.println(employee.toString());
            }
        }
    }

    public void showAllEmployeesWithSalary(Role role) {
        NumberFormat formatter = NumberFormat.getInstance(Locale.of("id", "ID"));
        for (Employee employee : employees) {
            if (role == Role.ALL) {
                System.out.println(employee.toString());
                System.out.printf("Monthly Salary: Rp %s%n", formatter.format(employee.getMonthlySalary()));
            }
            else if (role == Role.PROGRAMMER && employee instanceof Programmer) {
                System.out.println(employee.toString());
                System.out.printf("Monthly Salary: Rp %s%n", formatter.format(employee.getMonthlySalary()));
            }
            else if (role == Role.PM && employee instanceof ProjectManager) {
                System.out.println(employee.toString());
                System.out.printf("Monthly Salary: Rp %s%n", formatter.format(employee.getMonthlySalary()));
            }
            else if (role == Role.CS && employee instanceof CleaningService) {
                System.out.println(employee.toString());
                System.out.printf("Monthly Salary: Rp %s%n", formatter.format(employee.getMonthlySalary()));
            }
        }
    }

    public Employee getEmployee(String employeeID) {
        for (Employee employee : employees) {
            if (employee.id != null && employee.id.equals(employeeID)) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
