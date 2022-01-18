import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class person {

    private String name;
    private String email;
    private String phoneNumber;
    private String adress;
    private LocalDate dateOfBirth;

    public person(String name, String email, String phoneNumber, String adress, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public person(String name, String email, String phoneNumber, String adress, String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.setDateOfBirth(dateOfBirth);
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.dateOfBirth, today);
        return period.getYears();
    }
}


