package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.user.dto.CustomerDto;
import ch.noser.uek223.domain.user.dto.SupplierDto;
import ch.noser.uek223.domain.user.dto.UserDTO;
import ch.noser.uek223.domain.user.dto.UserDTONew;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    CustomerDto customerToCustomerDto(User user);
    User customerDtoToCustomer(CustomerDto customerDto);
    SupplierDto supplierToSupplierDto(User user);
    User supplierDtoToSupplier(SupplierDto supplierDto);
    UserDTO userToUserDto(User user);
    User userDtoToUser(UserDTO userDto);
    UserDTONew userToUserDTONew(User user);
    User userDTONewToUser(UserDTONew userDTONew);

}
