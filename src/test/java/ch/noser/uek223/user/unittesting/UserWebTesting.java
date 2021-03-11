package ch.noser.uek223.user.unittesting;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.role.Role;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Collection;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;

@SpringBootTest
public class UserWebTesting {

    @Autowired
    private MockMvc mvc;

    @Test
    public void findAll_requestAllUsers_returnsAllUsers() throws Exception {
        given(userService.findAll()).willReturn(listOfUsersToBeTestedAgainst);
        mvc.perform(
                MockMvcRequestBuilders.get("/users")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].id").value(Matchers.containsInAnyOrder(userToBeTestedAgainst.getId(),userToBeTestedAgainst.getId())))
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].firstName").value(Matchers.containsInAnyOrder(userToBeTestedAgainst.getFirstName(),userToBeTestedAgainst.getFirstName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].lastName").value(Matchers.containsInAnyOrder(userToBeTestedAgainst.getLastName(),userToBeTestedAgainst.getLastName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].email").value(Matchers.containsInAnyOrder(userToBeTestedAgainst.getEmail(),userToBeTestedAgainst.getEmail())))
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].roles[*].name").value(Matchers.containsInAnyOrder(ArrayUtils.addAll(userToBeTestedAgainst.getRoles().stream().map(Role::getName).toArray(), userToBeTestedAgainst.getRoles().stream().map(Role::getName).toArray()))))
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].roles[*].authorities[*].name").value(Matchers.containsInAnyOrder(ArrayUtils.addAll(userToBeTestedAgainst.getRoles().stream().map(Role::getAuthorities).flatMap(Collection::stream).map(Authority::getName).toArray(), userToBeTestedAgainst.getRoles().stream().map(Role::getAuthorities).flatMap(Collection::stream).map(Authority::getName).toArray()))));
        verify(userService, times(1)).findAll();
    }

}
