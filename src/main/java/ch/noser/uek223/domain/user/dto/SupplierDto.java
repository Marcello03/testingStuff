package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dto.RoleDTO;

import java.util.Set;
import java.util.UUID;

public class SupplierDto {

    private UUID id;
    private String email;
    private String firstName;
    private String surname;
    private String passwordHash;
    private Set<RoleDTO> roles;

    public SupplierDto() {
    }

    public SupplierDto(UUID id, String email, String firstName, String surname, String passwordHash, Set<RoleDTO> roleDTOSet) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
        this.passwordHash = passwordHash;
        this.roles = roleDTOSet;
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

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDTO> roleDTOSet) {
        this.roles = roleDTOSet;
    }
}
