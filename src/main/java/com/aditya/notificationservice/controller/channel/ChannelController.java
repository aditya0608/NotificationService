package com.aditya.notificationservice.controller.channel;


import com.aditya.notificationservice.dto.ChannelDTO;
import com.aditya.notificationservice.exceptions.ChannelNotFoundException;
import com.aditya.notificationservice.models.ChannelType;
import com.aditya.notificationservice.repository.ChannelRepository;
import com.aditya.notificationservice.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification/channels")
public class ChannelController {

    @Autowired
    ChannelService channelService ;

    @PostMapping
    public ChannelType addChannel(@RequestBody ChannelDTO channelDTO)
    {
        return channelService.addChannel(channelDTO);
    }
    @PutMapping
    public ChannelType updateChannelCode(@RequestBody ChannelDTO channelDTO) throws ChannelNotFoundException {
        System.out.println(channelDTO.getChannelDesc());
        return channelService.updateChannel(channelDTO);
    }
}
