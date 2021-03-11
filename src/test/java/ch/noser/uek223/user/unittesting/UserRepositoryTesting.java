package ch.noser.uek223.user.unittesting;

import ch.noser.uek223.domain.user.User;
import ch.noser.uek223.domain.user.UserRepository;
import io.jsonwebtoken.lang.Assert;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Optional;
import java.util.UUID;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserRepositoryTesting<DBConnection> {

    private final UserRepository repository;

    @InjectMocks
    private DBConnection dbConnection;
    @Mock
    private Connection mockConnection;
    @Mock
    private Statement mockStatement;

    @Test
    public void testMockDBConnection() throws Exception {
        Mockito.when(mockConnection.createStatement()).thenReturn(mockStatement);
        Mockito.when(mockConnection.createStatement().executeUpdate(Mockito.any())).thenReturn(1);
        int value = dbConnection.executeQuery("");
        Assertions.assertEquals(value, 1);
        Mockito.verify(mockConnection.createStatement(), Mockito.times(1));
    }

    @Autowired
    public UserRepositoryTesting(UserRepository repository) {
        this.repository = repository;
    }

    @Test
    public void findByEmail(){
        Optional<User> userByEmail = repository.findByEmail("ma@mail.com");
        Assertions.assertEquals(userByEmail.get().getId(), UUID.fromString("f605d721-dea9-4f16-b6ce-4e93e8433c59"));
    }

}
