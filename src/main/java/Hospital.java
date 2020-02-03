import java.util.HashMap;

public class Hospital {

    private HashMap<String, Human> humansInHospital = new HashMap<>();

    public void addHuman(Human humanToBeAdded) {
        humansInHospital.put(humanToBeAdded.getName(), humanToBeAdded);
    }


    public void drawAllPatientsBlood() {
        for (Human humansInHospital : humansInHospital.values()) {
            if (humansInHospital instanceof Patient) {
                ((Patient) humansInHospital).haveBloodDrawn();
            }
        }
    }

    public void treatAllPatients() {
        for (Human humansInHospital : humansInHospital.values()) {
            if (humansInHospital instanceof Patient) {
                ((Patient) humansInHospital).beTreated();
            }
        }
    }

    public int getNumberOfPatientsUnderCare() {
        int numberOfPatients = 0;
        for (Human humansInHospital : humansInHospital.values()) {
            if (humansInHospital instanceof Patient) {
                numberOfPatients++;
            }
        }
        return numberOfPatients;
    }

    public void printEmployees() {
        for (Human humansInHospital : humansInHospital.values()) {
            if (humansInHospital instanceof Employee) {
                System.out.println(((Employee) humansInHospital).getJobTitle() + ": " +
                        ((Employee) humansInHospital).getName() + " -- Employee ID: " +
                        ((Employee) humansInHospital).getEmployeeNumber() + " -- Salary: " +
                        ((Employee) humansInHospital).getSalary() + " -- Received Paycheck: " +
                        ((Employee) humansInHospital).getBeenPaid());
                if (humansInHospital instanceof Janitor) {
                    System.out.println("The janitor is sweeping: " + ((Janitor)humansInHospital).isSweeping);
                }
                if (humansInHospital instanceof Receptionist) {
                    System.out.println("The receptionist is on the phone: " + ((Receptionist) humansInHospital).onPhone);
                }
            }
        }
    }

    public void printPatients() {
        for (Human humansInHospital : humansInHospital.values()) {
            if (humansInHospital instanceof Patient) {
                System.out.println("Patient Name: " +
                        ((Patient) humansInHospital).getName() + " - Blood Level: " +
                        ((Patient) humansInHospital).getBLOOD_LEVEL() + " - Health Level: " +
                        ((Patient) humansInHospital).getHEALTH_LEVEL());
            }
        }
    }

    public void payAllEmployees() {
        for (Human humansInHospital : humansInHospital.values()) {
            if (humansInHospital instanceof Employee) {
                ((Employee) humansInHospital).payEmployee();
            }
        }
    }

    public Human getHuman(String humanToGet) {
        return humansInHospital.get(humanToGet);
    }
}