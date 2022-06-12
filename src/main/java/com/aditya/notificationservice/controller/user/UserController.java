package com.aditya.notificationservice.controller.user;
import com.aditya.notificationservice.dto.UserDTO;
import com.aditya.notificationservice.exceptions.ChannelNotFoundException;
import com.aditya.notificationservice.exceptions.UserNotFoundException;
import com.aditya.notificationservice.models.User;
import com.aditya.notificationservice.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User registerUser(@RequestBody UserDTO userDTO)
    {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/{userId}/{channelDesc}")
    public User subscribeChannel(@PathVariable String userId,@PathVariable String channelDesc) throws UserNotFoundException, ChannelNotFoundException {
        return userService.subscribeChannel(userId,channelDesc);
    }
}
