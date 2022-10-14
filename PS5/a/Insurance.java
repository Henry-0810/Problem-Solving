package PS5.a;

public class Insurance {
    private String policyName;
    private int privacyID;

    public Insurance(String policyName, int privacyID) {
        setPolicyName(policyName);
        setPrivacyID(privacyID);
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public int getPrivacyID() {
        return privacyID;
    }

    public void setPrivacyID(int privacyID) {
        this.privacyID = privacyID;
    }

    @Override
    public String toString() {
        return "Insurance details: Policy Name: " + getPolicyName() + " Policy ID: " + getPrivacyID();
    }
}
