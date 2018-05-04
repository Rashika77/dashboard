package com.accolite.dashboard.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.dashboard.dto.EventDTO;
import com.accolite.dashboard.dto.mapper.EventMapper;
import com.accolite.dashboard.service.EventService;

/**
 * 
 * @author rashika.devadiga
 *
 */

@RestController
@RequestMapping(value = "/events")
public class EventController {
	@Autowired
	private EventService eventService;

	@Autowired
	private EventMapper eventMapper;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public EventDTO getEventById(@PathVariable final Long id) throws Exception {
		return eventMapper.toEventDTO(eventService.findOne(id));
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<EventDTO> getAllEvents() throws Exception {
		return eventMapper.toEventDTOList(eventService.findAll());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public EventDTO updateEvent(@RequestBody final EventDTO eventDTO) throws Exception {
		return eventMapper
				.toEventDTO(eventService.save(eventMapper.toEventEntity(eventDTO)));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeEvent(@PathVariable final Long id) throws Exception {
		eventService.delete(id);
	}
}
