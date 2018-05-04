package com.accolite.dashboard.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.dashboard.dto.NotificationDTO;
import com.accolite.dashboard.dto.mapper.NotificationMapper;
import com.accolite.dashboard.service.NotificationService;

/**
 * 
 * @author rashika.devadiga
 *
 */
@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {
	@Autowired
	private NotificationService notificationService;

	@Autowired
	private NotificationMapper notificationMapper;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public NotificationDTO getNotificationById(@PathVariable final Long id) throws Exception {
		return notificationMapper.toNotificationDTO(notificationService.findOne(id));
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<NotificationDTO> getAllNotifications() throws Exception {
		return notificationMapper.toNotificationDTOList(notificationService.findAll());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public NotificationDTO updateNotification(@RequestBody final NotificationDTO notificationDTO) throws Exception {
		return notificationMapper
				.toNotificationDTO(notificationService.save(notificationMapper.toNotificationEntity(notificationDTO)));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeNotification(@PathVariable final Long id) throws Exception {
		notificationService.delete(id);
	}
}
