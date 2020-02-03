import java.util.Scanner;

public class HospitalApplication {

    public static Scanner input = new Scanner(System.in);
    public static Hospital hospital = new Hospital();

    public static void main(String[] args) {

        Hospital humansInHospital = new Hospital();

        Employee doctor = new Doctor("Walter White", 90000, 1, 10024, false, true, "Neurology", "Doctor");
        Employee nurse = new Nurse("Jesse Pinkman", 50000, 1, 10023, false, true, 3, "Nurse");
        Employee receptionist = new Receptionist("Skyler", 45000, 1, 10022, false, false, "Receptionist");
        Employee janitor = new Janitor("Walter Jr.", 40000, 1, 10021, false, false, "Janitor");

        Patient patient1 = new Patient("Tuco");
        Patient patient2 = new Patient("Gus");
        Patient patient3 = new Patient("Crazy8");

        hospital.addHuman(doctor);
        hospital.addHuman(nurse);
        hospital.addHuman(receptionist);
        hospital.addHuman(janitor);
        hospital.addHuman(patient1);
        hospital.addHuman(patient2);
        hospital.addHuman(patient3);

        System.out.println("Welcome to the High Street Hospital.");
        hospital.printEmployees();

        int menuChoice = 1;
        while (menuChoice != 0) {

            System.out.println("What would you like to do today? Enter the corresponding integer:\n" +
                    "[1] Pay all employees.\n" +
                    "[2] Treat a specific patient\n" +
                    "[3] Treat all patients\n" +
                    "[4] Take a patient's blood sample\n" +
                    "[5] Take all patient's blood samples\n" +
                    "[6] Have janitor sweep/stop sweeping the hospital\n" +
                    "[7] Have receptionist answer/get off the phone\n" +
                    "[8] Display employee information\n" +
                    "[9] Check patient stats\n" +
                    "[0] Exit");

            menuChoice = input.nextInt();

            switch (menuChoice) {
                case 1:
                    hospital.payAllEmployees();
                    System.out.println("The employees have been paid!");
                    break;

                case 2:
                    System.out.println("Would you like the [nurse] or [doctor] to treat the patient?");
                    String doctorOrNurse = input.next();

                    if (doctorOrNurse.equalsIgnoreCase("nurse")) {
                        hospital.printPatients();
                        System.out.println("Enter the name of the patient you'd like to treat:");
                        String patientNurseTreats = input.next();
                        Human humanToBeTreated = hospital.getHuman(patientNurseTreats);
                        ((Patient) humanToBeTreated).haveNurseCheckOnPatient();
                        System.out.println(patientNurseTreats + " was treated by the " + doctorOrNurse + "!");
                    } else if (doctorOrNurse.equalsIgnoreCase("doctor")) {
                        hospital.printPatients();
                        System.out.println("Enter the name of the patient you'd like to treat:");
                        String patientDoctorTreats = input.next();
                        Human humanToBeTreated = hospital.getHuman(patientDoctorTreats);
                        ((Patient) humanToBeTreated).haveDoctorTreatPatient();
                        System.out.println(patientDoctorTreats + " was treated by the " + doctorOrNurse + "!");
                    }
                    break;

                case 3:
                    hospital.treatAllPatients();
                    System.out.println("All the patients have been treated!");
                    break;

                case 4:
                    System.out.println("Would you like the [nurse] or [doctor] to get a blood sample?");
                    String doctorOrNurse2 = input.next();

                    if (doctorOrNurse2.equalsIgnoreCase("nurse")) {
                        hospital.printPatients();
                        System.out.println("Enter the name of the patient you need a blood sample from:");
                        String humanBloodDrawnByNurse = input.next();
                        Human humanGettingBloodDrawn = hospital.getHuman(humanBloodDrawnByNurse);
                        ((Patient) humanGettingBloodDrawn).haveNurseDrawBlood();
                        System.out.println(humanBloodDrawnByNurse + " got their blood sample taken by the " + doctorOrNurse2 + "!");
                    } else if (doctorOrNurse2.equalsIgnoreCase("doctor")) {
                        hospital.printPatients();
                        System.out.println("Enter the name of the patient you need a blood sample from:");
                        String humanBloodDrawnByDoctor = input.next();
                        Human humanGettingBloodDrawn = hospital.getHuman(humanBloodDrawnByDoctor);
                        ((Patient) humanGettingBloodDrawn).haveDoctorDrawBlood();
                        System.out.println(humanBloodDrawnByDoctor + " got their blood sample taken by the " + doctorOrNurse2 + "!");
                    }
                    break;
                case 5:
                    hospital.drawAllPatientsBlood();
                    System.out.println("You have a sample of all the patients' blood!");
                    break;
                case 6:
                    Human janitorToSweep = hospital.getHuman("Walter Jr.");
                    ((Janitor) janitorToSweep).sweepSwitch();

                    System.out.println("The janitor is sweeping the hospital tirelessly.");
                    break;
                case 7:
                    Human rececptionistOnPhone = hospital.getHuman("Skyler");
                    ((Receptionist) rececptionistOnPhone).answeringPhone();
                    System.out.println("The receptionist is currently taking calls.");
                    break;
                case 8:
                    hospital.printEmployees();
                    break;
                case 9:
                    hospital.printPatients();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

}
