package MockFinals;

public abstract class Person {
    private String firstname;
    private String lastname;
    protected String PPSN;
    private String address;
    private String mobile;

    public Person(String firstname, String lastname, String PPSN, String address, String mobile) {
        setFirstname(firstname);
        setLastname(lastname);
        setPPSN(PPSN);
        setAddress(address);
        setMobile(mobile);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPPSN(String PPSN) {
        this.PPSN = PPSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstname() + " " + getLastname() +"\nPPSN: " + PPSN + "\nAddress: " + getAddress() +
                "\nMobile: " + getMobile();
    }
}
