package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.user.dto.UserDTO;
import ch.noser.uek223.domain.user.dto.UserDTONew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserWeb {

    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserWeb(UserService userService, UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping({"/", ""})
    public ResponseEntity<Collection<User>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }

    @PostMapping({"/", ""})
    public ResponseEntity<UserDTO> create(@RequestBody UserDTONew userDTONew) {
        return new ResponseEntity<UserDTO>(userMapper.userToUserDto(userService.create(userMapper.userDTONewToUser(userDTONew))), HttpStatus.CREATED);
    }

}
