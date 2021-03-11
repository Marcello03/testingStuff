package ch.noser.uek223.domain.user.dto;

public class UserDTONew {

    private String email;
    private String password;
    private String firstName;
    private String surname;

    public UserDTONew() {
    }

    public UserDTONew(String email, String password, String firstName, String surname) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
