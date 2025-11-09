import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeApp employeeApp = new EmployeeApp();

        System.out.println("==================================================");
        System.out.println("[1] Add Programmer");
        System.out.println("[2] Add Android Programmer");
        System.out.println("[3] Add Project Manager");
        System.out.println("[4] Add Cleaning Service");
        System.out.println("[5] Edit Employee");
        System.out.println("[6] Show All Employees");
        System.out.println("[7] Show All Programmer");
        System.out.println("[8] Show All Project Manager");
        System.out.println("[9] Show All Cleaning Service");
        System.out.println("[10] Exit");

        int choice;
        do {
            System.out.print("Choose an option: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                System.out.print("Choose an option: ");
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Employee ID: ");
                    String programmerID = sc.nextLine();

                    if (employeeApp.getEmployee(programmerID) != null) {
                        System.out.println("Duplicate ID");
                    }
                    else {
                        System.out.print("Programmer Name: ");
                        String programmerName = sc.nextLine();
                        System.out.print("Birth Date (YYYY-MM-DD): ");
                        String programmerBirthDate = sc.nextLine();
                        System.out.print("Joined Date (YYYY-MM-DD): ");
                        String programmerJoinedDate = sc.nextLine();
                        System.out.print("Salary: ");
                        long programmerSalary = sc.nextLong();
                        sc.nextLine();

                        Programmer programmer = new Programmer();
                        programmer.id = programmerID;
                        programmer.name = programmerName;
                        programmer.birthDate = LocalDate.parse(programmerBirthDate);
                        programmer.joinedDate = LocalDate.parse(programmerJoinedDate);
                        programmer.salary = programmerSalary;

                        employeeApp.addEmployee(programmer);
                        System.out.println("Programmer added successfully");
                    }
                    break;
                case 2:
                    System.out.print("Employee ID: ");
                    String androidID = sc.nextLine();

                    if (employeeApp.getEmployee(androidID) != null) {
                        System.out.println("Duplicate ID");
                    }
                    else {
                        System.out.print("Android Programmer Name: ");
                        String androidName = sc.nextLine();
                        System.out.print("Birth Date (YYYY-MM-DD): ");
                        String androidBirthDate = sc.nextLine();
                        System.out.print("Joined Date (YYYY-MM-DD): ");
                        String androidJoinedDate = sc.nextLine();
                        System.out.print("Salary: ");
                        long androidSalary = sc.nextLong();
                        sc.nextLine();

                        AndroidProgrammer androidProgrammer = new AndroidProgrammer();
                        androidProgrammer.id = androidID;
                        androidProgrammer.name = androidName;
                        androidProgrammer.birthDate = LocalDate.parse(androidBirthDate);
                        androidProgrammer.joinedDate = LocalDate.parse(androidJoinedDate);
                        androidProgrammer.salary = androidSalary;

                        employeeApp.addEmployee(androidProgrammer);
                        System.out.println("Android Programmer added successfully");
                    }
                    break;
                case 3:
                    System.out.print("Employee ID: ");
                    String pmID = sc.nextLine();

                    if (employeeApp.getEmployee(pmID) != null) {
                        System.out.println("Duplicate ID");
                    }
                    else {
                        System.out.print("Project Manager Name: ");
                        String pmName = sc.nextLine();
                        System.out.print("Birth Date (YYYY-MM-DD): ");
                        String pmBirthDate = sc.nextLine();
                        System.out.print("Joined Date (YYYY-MM-DD): ");
                        String pmJoinedDate = sc.nextLine();
                        System.out.print("Salary: ");
                        long pmSalary = sc.nextLong();
                        sc.nextLine();

                        ProjectManager projectManager = new ProjectManager();
                        projectManager.id = pmID;
                        projectManager.name = pmName;
                        projectManager.birthDate = LocalDate.parse(pmBirthDate);
                        projectManager.joinedDate = LocalDate.parse(pmJoinedDate);
                        projectManager.salary = pmSalary;

                        employeeApp.addEmployee(projectManager);
                        System.out.println("Project Manager added successfully");
                    }
                    break;
                case 4:
                    System.out.print("Employee ID: ");
                    String csID = sc.nextLine();

                    if (employeeApp.getEmployee(csID) != null) {
                        System.out.println("Duplicate ID");
                    }
                    else {
                        System.out.print("Cleaning Service Name: ");
                        String csName = sc.nextLine();
                        System.out.print("Birth Date (YYYY-MM-DD): ");
                        String csBirthDate = sc.nextLine();
                        System.out.print("Joined Date (YYYY-MM-DD): ");
                        String csJoinedDate = sc.nextLine();
                        System.out.print("Salary: ");
                        long csSalary = sc.nextLong();
                        sc.nextLine();

                        CleaningService cleaningService = new CleaningService();
                        cleaningService.id = csID;
                        cleaningService.name = csName;
                        cleaningService.birthDate = LocalDate.parse(csBirthDate);
                        cleaningService.joinedDate = LocalDate.parse(csJoinedDate);
                        cleaningService.salary = csSalary;

                        employeeApp.addEmployee(cleaningService);
                        System.out.println("Cleaning Service added successfully");
                    }
                    break;
                case 5:
                    System.out.println("List of all employees");
                    employeeApp.showAllEmployees(Role.ALL);
                    System.out.print("Input Employee ID: ");
                    String checkID = sc.nextLine();

                    Employee employeeToEdit = employeeApp.getEmployee(checkID);

                    if (employeeToEdit == null) {
                        System.out.println("ID not found");
                    } else {
                        System.out.print("Name: ");
                        String editName = sc.nextLine();
                        System.out.print("Birth Date (YYYY-MM-DD): ");
                        String editBirthDate = sc.nextLine();

                        employeeToEdit.name = editName;
                        employeeToEdit.birthDate = LocalDate.parse(editBirthDate);

                        System.out.println("Employee updated successfully");
                    }
                    break;
                case 6:
                    employeeApp.showAllEmployeesWithSalary(Role.ALL);
                    break;
                case 7:
                    employeeApp.showAllEmployeesWithSalary(Role.PROGRAMMER);
                    break;
                case 8:
                    employeeApp.showAllEmployeesWithSalary(Role.PM);
                    break;
                case 9:
                    employeeApp.showAllEmployeesWithSalary(Role.CS);
                    break;
                case 10:
                    System.out.println("Program finished");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 10);
}
    }
