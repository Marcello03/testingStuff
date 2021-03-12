package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dto.RoleDTO;

import java.util.Set;
import java.util.UUID;

public class CustomerDto {

    private UUID id;
    private String email;
    private String firstName;
    private String surname;
    private Set<RoleDTO> roleDTOSet;

    public CustomerDto() {
    }

    public CustomerDto(UUID id, String email, String firstName, String surname, Set<RoleDTO> roleDTOSet) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
        this.roleDTOSet = roleDTOSet;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Set<RoleDTO> getRoleDTOSet() {
        return roleDTOSet;
    }

    public void setRoleDTOSet(Set<RoleDTO> roleDTOSet) {
        this.roleDTOSet = roleDTOSet;
    }
}
