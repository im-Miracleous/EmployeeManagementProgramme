import java.time.LocalDate;

public class ProjectManager extends Employee {
    private String handledProject = "";

    public String getOngoingProject() {
        if (handledProject.isEmpty()) {
            return "You haven't started a new project yet.";
        } else {
            return handledProject;
        }
    }

    public void removeOngoingProject() {
        this.handledProject = "";
    }

    public void setHandledProject(String handledProject) {
        if (handledProject.isEmpty()) {
            System.out.println("Project name cannot be empty!");
        } else {
            this.handledProject = handledProject;
        }
    }

    public long getAllowance() {
        if (joinedDate == null) {
            return 0;
        }
        int workingYear = LocalDate.now().getYear() - joinedDate.getYear();
        if (workingYear >= 5) {
            return workingYear * 500000L;
        } else {
            return workingYear * 250000L;
        }
    }

    @Override
    public long getMonthlySalary() {
        return 2 * salary + getAllowance();
    }
}
