package com.accolite.dashboard.repository;

import org.springframework.stereotype.Repository;

import com.accolite.dashboard.entity.Event;

import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author rashika.devadiga
 *
 */

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

}
