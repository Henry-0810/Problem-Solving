package PS10.a;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;

    public Person() {

    }

    public Person(String name, String address, GregorianCalendar dateOfBirth) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Address: " + getAddress() + " Date of Birth: " + getDateOfBirth().get(Calendar.DATE)
                + "-" + getDateOfBirth().get(Calendar.MONTH) + "-" + getDateOfBirth().get(Calendar.YEAR);
    }
}
