package MockFinals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Patient extends Person{
    private String bloodType;
    private String[] allergies;
    private final ArrayList<GregorianCalendar> appointments;

    public Patient(String firstname, String lastname, String PPSN, String address, String mobile, String bloodType, String[] allergies) {
        super(firstname, lastname, PPSN, address, mobile);
        setBloodType(bloodType);
        setAllergies(allergies);
        this.appointments = new ArrayList<>();
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }

    public ArrayList<GregorianCalendar> getAppointments() {
        return appointments;
    }

    public void addAppointment(GregorianCalendar date){
        this.appointments.add(date);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBlood-type: " + getBloodType() + "\nAllergies: " + Arrays.toString(getAllergies())
                + "\nAppointments: " + getAppointments();
    }
}
