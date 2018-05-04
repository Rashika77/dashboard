package com.accolite.dashboard.dto.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import com.accolite.dashboard.dto.EventDTO;
import com.accolite.dashboard.entity.Event;

@Mapper(componentModel = "spring")
@Component
public abstract class EventMapper {

	@Mappings({ @Mapping(source = "id", target = "id"), @Mapping(source = "eventTitle", target = "eventTitle"),
			@Mapping(source = "eventSubtitle", target = "eventSubtitle"),
			@Mapping(source = "eventLink", target = "eventLink"),
			@Mapping(source = "eventUploadedBy", target = "eventUploadedBy"),
			@Mapping(source = "eventUploadedOn", target = "eventUploadedOn") })
	@Named("toEventDTO")
	public abstract EventDTO toEventDTO(Event event) throws Exception;
	
    @IterableMapping(qualifiedByName = "toEventDTO")
	public abstract List<EventDTO> toEventDTOList(Iterable<Event> eventList) throws Exception;

	@Mappings({ @Mapping(source = "id", target = "id"), @Mapping(source = "eventTitle", target = "eventTitle"),
			@Mapping(source = "eventSubtitle", target = "eventSubtitle"),
			@Mapping(source = "eventLink", target = "eventLink"),
			@Mapping(source = "eventUploadedBy", target = "eventUploadedBy"),
			@Mapping(source = "eventUploadedOn", target = "eventUploadedOn") })
	@Named("toEventEntity")
	public abstract Event toEventEntity(EventDTO eventDTO) throws Exception;
	
    @IterableMapping(qualifiedByName = "toEventEntity")
	public abstract List<Event> toEventEntityList(Iterable<EventDTO> eventDTOList) throws Exception;

}
