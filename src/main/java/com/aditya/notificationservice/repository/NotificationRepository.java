package com.aditya.notificationservice.repository;

import com.aditya.notificationservice.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
