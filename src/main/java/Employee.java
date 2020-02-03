public class Employee extends Human {

    public int salary;
    public int payRate = 1;
    public int employeeNumber;
    public boolean beenPaid;
    public String jobTitle;

    public Employee(String name, int salary, int payRate, int employeeNumber, boolean beenPaid, String jobTitle) {
        super(name);
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public boolean isBeenPaid() {
        return beenPaid;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBeenPaid(boolean beenPaid) {
        this.beenPaid = true;
    }

    public int getSalary() {
        return salary;
    }

    public int getPayRate() {
        return payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public boolean getBeenPaid() {
        return beenPaid;
    }

    public void payEmployee() {
        beenPaid = true;
    }
}
