package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.Role;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class UserDTO {

    private UUID id;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private Set<Role> roles = new HashSet<>();

    public UserDTO() {
    }

    public UserDTO(UUID id) {
        this.id = id;
    }

    public UserDTO(UUID id, String firstName, String lastName, String password, String email, Set<Role> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public UserDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public UserDTO setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }
}
