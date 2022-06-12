package com.aditya.notificationservice.service.user;

import com.aditya.notificationservice.dto.UserDTO;
import com.aditya.notificationservice.exceptions.ChannelNotFoundException;
import com.aditya.notificationservice.exceptions.UserNotFoundException;
import com.aditya.notificationservice.models.ChannelType;
import com.aditya.notificationservice.models.User;
import com.aditya.notificationservice.repository.ChannelRepository;
import com.aditya.notificationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ChannelRepository channelRepository;

    public User saveUser(UserDTO userDTO)
    {
        User user=new User();
        user.setUserId(userDTO.getUserId());
        user.setName(userDTO.getEmailId());
        user.setEmailId(userDTO.getEmailId());
        return userRepository.save(user);
    }
    public User subscribeChannel(String userId, String channelDesc) throws ChannelNotFoundException, UserNotFoundException {
        User user = userRepository.findByUserId(userId);
        if (null != user) {
            ChannelType channel = channelRepository.findByChannelDesc(channelDesc);
            if (null != channel) {
                user.getChannels().add(channel);
                userRepository.save(user);
            } else
                throw new ChannelNotFoundException("Channel desc :" + channelDesc + "is not present in the database");
        } else
            throw new UserNotFoundException("User Id :" + userId + "is not found int he database");
        return user;
    }
}
