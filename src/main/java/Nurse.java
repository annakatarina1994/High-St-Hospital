public class Nurse extends Medical{

    private int numberOfPatientsUnderCare = 3;
    public String jobTitle;

    public Nurse(String name, int salary, int payRate, int employeeNumber, boolean beenPaid, boolean canDrawBlood, int numberOfPatientsUnderCare, String jobTitle) {
        super(name, salary, payRate, employeeNumber, beenPaid, canDrawBlood, jobTitle);
        this.numberOfPatientsUnderCare = numberOfPatientsUnderCare;
        this.jobTitle = jobTitle;
        this.salary = 50000;
        this.employeeNumber = employeeNumber;
    }
}


