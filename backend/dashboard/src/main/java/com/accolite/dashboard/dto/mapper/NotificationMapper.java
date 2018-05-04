package com.accolite.dashboard.dto.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import com.accolite.dashboard.dto.NotificationDTO;
import com.accolite.dashboard.entity.Notification;

/**
 * 
 * @author rashika.devadiga
 *
 */
@Mapper(componentModel = "spring")
@Component
public abstract class NotificationMapper {

	@Mappings({ @Mapping(source = "id", target = "id"),
			@Mapping(source = "notificationTitle", target = "notificationTitle"),
			@Mapping(source = "notificationSubtitle", target = "notificationSubtitle"),
			@Mapping(source = "notificationLink", target = "notificationLink"),
			@Mapping(source = "notificationUploadedBy", target = "notificationUploadedBy"),
			@Mapping(source = "notificationUploadedOn", target = "notificationUploadedOn") })
	@Named("toNotificationDTO")
	public abstract NotificationDTO toNotificationDTO(Notification notification) throws Exception;

	@IterableMapping(qualifiedByName = "toNotificationDTO")
	public abstract List<NotificationDTO> toNotificationDTOList(Iterable<Notification> notificationList)
			throws Exception;

	@Mappings({ @Mapping(source = "id", target = "id"),
			@Mapping(source = "notificationTitle", target = "notificationTitle"),
			@Mapping(source = "notificationSubtitle", target = "notificationSubtitle"),
			@Mapping(source = "notificationLink", target = "notificationLink"),
			@Mapping(source = "notificationUploadedBy", target = "notificationUploadedBy"),
			@Mapping(source = "notificationUploadedOn", target = "notificationUploadedOn") })
	@Named("toNotificationEntity")
	public abstract Notification toNotificationEntity(NotificationDTO notificationDTO) throws Exception;

	@IterableMapping(qualifiedByName = "toNotificationEntity")
	public abstract List<Notification> toNotificationEntityList(Iterable<NotificationDTO> notificationDTOList)
			throws Exception;

}
