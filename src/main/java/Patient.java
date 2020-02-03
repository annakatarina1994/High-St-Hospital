public class Patient extends Human {

    public int BLOOD_LEVEL = 20;
    public int HEALTH_LEVEL = 10;


    public Patient(String name) {
        super(name);
    }

    public int getBLOOD_LEVEL() {
        return BLOOD_LEVEL;
    }

    public int getHEALTH_LEVEL() {
        return HEALTH_LEVEL;
    }

    public void haveNurseCheckOnPatient(){
        HEALTH_LEVEL += 3;
    }

    public void haveNurseDrawBlood(){
        BLOOD_LEVEL -= 5;
    }

    public void haveDoctorTreatPatient(){
        HEALTH_LEVEL += 5;
    }

    public void haveDoctorDrawBlood(){
        BLOOD_LEVEL -= 7;
    }

    public void beTreated() {
    HEALTH_LEVEL += 2;
    }

    public void haveBloodDrawn() {
    BLOOD_LEVEL -= 3;
    }
}
