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
        patients = new ArrayList<>();
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
        patients.add(patient);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(super.toString() + "\nEmployee ID: " + getEmployeeID() + "\nSpeciality: " + getSpeciality() +
                "\nStart Date: " + getStartDate().get(Calendar.DATE) + "-" + getStartDate().get(Calendar.MONTH) +
                "-" + getStartDate().get(Calendar.YEAR) + "\nPatients: \n\n");

        ArrayList<Patient> patients = getPatients();

        for(Patient patient: patients){
            output.append(patient).append("\n\n");
        }

        return output.toString();
    }
}
