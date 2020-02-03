public class Receptionist extends Employee{

    public boolean onPhone;
    public String jobTitle;

    public Receptionist(String name, int salary, int payRate, int employeeNumber, boolean beenPaid, boolean onPhone, String jobTitle) {
        super(name, salary, payRate, employeeNumber, beenPaid, jobTitle);
        this.onPhone = onPhone;
        this.jobTitle = jobTitle;
        this.salary = 45000;
        this.employeeNumber = employeeNumber;
    }
    public void answeringPhone(){
        onPhone ^= true;
    }
}
