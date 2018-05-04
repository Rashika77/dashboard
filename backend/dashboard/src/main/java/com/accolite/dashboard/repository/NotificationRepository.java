package com.accolite.dashboard.repository;

import org.springframework.stereotype.Repository;

import com.accolite.dashboard.entity.Notification;

import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author rashika.devadiga
 *
 */

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {

}
