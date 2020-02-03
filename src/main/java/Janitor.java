import java.sql.SQLOutput;

public class Janitor extends Employee {

    public boolean isSweeping;

    public String jobTitle;

    public Janitor(String name, int salary, int payRate, int employeeNumber, boolean beenPaid, boolean isSweeping, String jobTitle) {
        super(name, salary, payRate, employeeNumber, beenPaid, jobTitle);
        this.isSweeping = isSweeping;
        this.jobTitle = jobTitle;
        this.salary = 40000;
        this.employeeNumber = employeeNumber;
    }

        public void sweepSwitch() {
          isSweeping ^= true;
    }
}