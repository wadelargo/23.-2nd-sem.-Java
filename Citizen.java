import java.time.LocalDate;

public class Citizen {
    private int citizenIdNumber;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String address;

    public Citizen() {
        lastName = "unknown";
        firstName = "unknown";
        address = "unknown";
    }

    public Citizen(int citizenIdNumber, String lastName, String firstName, LocalDate birthDate, String address) {
        this.citizenIdNumber = citizenIdNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.address = address;
    }

    public int getCitizenIdNumber() {
        return citizenIdNumber;
    }

    public void setCitizenIdNumber(int citizenIdNumber) {
        this.citizenIdNumber = citizenIdNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}