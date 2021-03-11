package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.role.dto.RoleDTO;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {

    RoleDTO roleToRoleDto(Role role);
    Role roleDtoToRole(RoleDTO roleDto);

}
