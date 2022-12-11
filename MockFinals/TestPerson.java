package MockFinals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class TestPerson {
    private static ArrayList<Doctor> doctors;
    private static ArrayList<Patient> patients;

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("Joe", "O Mahoney", "6673847J",
                "23 Ballinorig, Tralee, Co.Kerry", "085-2346537", "Obstetrics",
                new GregorianCalendar(2008, 6, 21));
        Doctor doctor2 = new Doctor("Mary", "Moloney", "7653382B",
                "54 Wesley Drive, Listowel, Co.Kerry", "087-1324764","Paediatrics",
                new GregorianCalendar(2011, 9, 8));
        Doctor doctor3 = new Doctor("Brian", "Lucey", "1765243K",
                "5 Sunset View, Waterville, Co.Kerry","085-2657890", "Cancer",
                new GregorianCalendar(2008, 6, 21));

        Patient patient1 = new Patient("Stephen", "Doherty", "8567493S",
                "7 Pieta Place, Dingle, Co. Kerry", "086-5483726", "O+", new String[]{"Peanut", "Gluten"});
        Patient patient2 = new Patient("Sarah", "O Connor", "9786483T",
                "108 Spa Rd, Tralee, Co. Kerry","087-3453253", "A-", new String[]{"Shellfish", "Insect Bites"});
        Patient patient3 = new Patient("Ellen", "Smith", "7645345F",
                "66 Ocean View, Ballyheigue, Co. Kerry","083-4546356", "B+", new String[]{});

        patients = new ArrayList<>(Arrays.asList(patient1,patient2,patient3));

        doctor1.addPatient(patient3);
        doctor2.addPatient(patient2);
        doctor2.addPatient(patient1);

        patient1.addAppointment(new GregorianCalendar(2020,6,18));
        patient1.addAppointment(new GregorianCalendar(2020,9,23));
        patient1.addAppointment(new GregorianCalendar(2021,3,6));

        patient2.addAppointment(new GregorianCalendar(2017,3,21));
        patient2.addAppointment(new GregorianCalendar(2019,6,2));

        patient3.addAppointment(new GregorianCalendar(2018,5,30));

        doctors = new ArrayList<>(Arrays.asList(doctor1,doctor2,doctor3));

        System.out.println("Displaying the current state of all Doctors in the system:\n\n");

        int i = 1;

        for (Doctor doctor: doctors) {
            System.out.println("Doctor " + (i) + "\n\n" + doctor + "\n\n");
            i++;
        }
    }

    public static ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public static ArrayList<Patient> getPatients() {
        return patients;
    }
}
