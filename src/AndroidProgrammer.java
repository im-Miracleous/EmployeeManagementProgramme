import java.time.LocalDate;

public class AndroidProgrammer extends Programmer implements MobileProgrammer {
    @Override
    public void developMobileApps() {
        System.out.println("Develop mobile apps using Kotlin");
    }

    public long getAllowance() {
        if (joinedDate == null) {
            return 0;
        }
        int workingYear = LocalDate.now().getYear() - joinedDate.getYear();
        if (workingYear >= 5) {
            return workingYear * 350000L;
        } else {
            return workingYear * 150000L;
        }
    }
}
