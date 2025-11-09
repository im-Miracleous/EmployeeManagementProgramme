import java.time.LocalDate;

public class Programmer extends Employee {
    public long getAllowance() {
        if (joinedDate == null) {
            return 0;
        }
        int workingYear = LocalDate.now().getYear() - joinedDate.getYear();
        if (workingYear >= 5) {
            return workingYear * 250000L;
        } else {
            return workingYear * 100000L;
        }
    }
}
