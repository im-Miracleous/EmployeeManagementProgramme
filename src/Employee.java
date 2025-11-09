import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {
    protected String id;
    protected String name;
    protected long salary;
    protected LocalDate birthDate;
    protected LocalDate joinedDate;

    public long getMonthlySalary() {
        return salary + getAllowance();
    }

    public abstract long getAllowance();

    public int getAge() {
        if (birthDate == null) {
            return 0;
        }
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format("%-20s : ID: %-8s ; Name: %-25s (%d); Join on: %s", getClass().getSimpleName(), id, name, getAge(), joinedDate);
    }
}
