package com.aditya.notificationservice.repository;

import com.aditya.notificationservice.models.ChannelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<ChannelType,Long> {

    public ChannelType findByChannelDesc(String channelDesc);
}
