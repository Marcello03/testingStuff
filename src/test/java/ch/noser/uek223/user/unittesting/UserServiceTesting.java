package ch.noser.uek223.user.unittesting;

import ch.noser.uek223.domain.user.UserRepository;
import ch.noser.uek223.domain.user.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class UserServiceTesting {

    @InjectMocks
    private UserServiceImpl userService;
    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Mock
    private UserRepository userRepository;

    @Test
    public void test(){




    }

}
