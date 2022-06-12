package com.aditya.notificationservice.repository;

import com.aditya.notificationservice.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {

}
