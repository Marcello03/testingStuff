package ch.noser.uek223.domain.authority;

import ch.noser.uek223.domain.authority.dto.AuthorityDTO;

public interface AuthorityMapper {

    AuthorityDTO authorityToAuthorityDto(Authority authority);
    Authority authorityDtoToAuthority(AuthorityDTO authorityDto);


}
