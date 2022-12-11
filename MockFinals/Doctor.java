package MockFinals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Doctor extends Person{
    private int employeeID;
    private static int count = 0;
    private String speciality;
    private GregorianCalendar startDate;
    private ArrayList<Patient> patients;

    public Doctor(String firstname, String lastname, String PPSN, String address, String mobile,
                  String speciality, GregorianCalendar startDate) {
        super(firstname, lastname, PPSN, address, mobile);
        setEmployeeID();
        setSpeciality(speciality);
        setStartDate(startDate);
        this.patients = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    private void setEmployeeID() {
        this.employeeID = ++count;
        //count++;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    @Override
    public String toString() {
        String output = super.toString() + "\nEmployee ID: " + getEmployeeID() + "\nSpeciality: " + getSpeciality() +
                "\nStart Date: " + getStartDate().get(Calendar.DATE) + "-" + getStartDate().get(Calendar.MONTH) +
                "-" + getStartDate().get(Calendar.YEAR) + "\nPatients: \n\n";

        for(Patient patient: getPatients()){
            getPatients();
            output += patient + "\n\n";
        }

        return "g";    }
}
