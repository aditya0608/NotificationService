package com.aditya.notificationservice.service.channel;


import com.aditya.notificationservice.dto.ChannelDTO;
import com.aditya.notificationservice.exceptions.ChannelNotFoundException;
import com.aditya.notificationservice.models.ChannelType;
import com.aditya.notificationservice.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChannelService {

    @Autowired
    ChannelRepository channelRepository;
    public ChannelType addChannel(ChannelDTO channelDTO)
    {
        ChannelType channel=new ChannelType(channelDTO.getChannelCode(),channelDTO.getChannelDesc());
        return channelRepository.save(channel);
    }

    public ChannelType updateChannel(ChannelDTO channelDTO) throws ChannelNotFoundException {

        ChannelType channelType=channelRepository.findByChannelDesc(channelDTO.getChannelDesc());
        System.out.println(channelDTO.getChannelDesc());
        if(null!=channelType)
        {
            channelType.setChannelCode(channelDTO.getChannelCode());
            channelType.setChannelDesc(channelDTO.getChannelDesc());
            channelRepository.save(channelType);
        }
        else
            throw new ChannelNotFoundException("Channel desc :" + channelDTO.getChannelDesc() + "is not present in the database");
        return channelType;
    }
}
