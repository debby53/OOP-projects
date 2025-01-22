package Organization;

public class CEO extends Manager {
    private String responsibilities;

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    @Override
    public void addSubordinates() {
        super.addSubordinates();
    }
}
