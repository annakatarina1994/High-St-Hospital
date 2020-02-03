public class Medical extends Employee {

    boolean canDrawBlood = true;

    public Medical(String name, int salary, int payRate, int employeeNumber, boolean beenPaid, boolean canDrawBlood, String jobTitle) {
        super(name, salary, payRate, employeeNumber, beenPaid, jobTitle);
        this.salary = salary;
    }


}
