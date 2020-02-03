public class Doctor extends Medical {

    private String specialtyArea = "Neurology";
    public String jobTitle;

    public Doctor(String name, int salary, int payRate, int employeeNumber, boolean beenPaid, boolean canDrawBlood, String specialtyArea, String jobTitle) {
        super(name, salary, payRate, employeeNumber, beenPaid, canDrawBlood, jobTitle);
        this.specialtyArea = specialtyArea;
        this.jobTitle = jobTitle;
        this.salary = 90000;
        this.employeeNumber = employeeNumber;
    }

    public String getSpecialtyArea() {
        return specialtyArea;
    }
}

