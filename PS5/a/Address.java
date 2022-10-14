package PS5.a;

public class Address {
    private String street;
    private String town;
    private String county;
    private String country;
    private String eircode;

    public Address(String street, String town, String county, String country, String eircode) {
        setStreet(street);
        setTown(town);
        setCounty(county);
        setCountry(country);
        setEircode(eircode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    @Override
    public String toString() {
        return "Address: Street: " + getStreet() + " Town: " + getTown() + " County: " + getCounty() + " Country: "
                + getCountry() + " Eircode: " + getEircode();
    }
}
