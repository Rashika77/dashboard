package com.accolite.dashboard.dto;

import java.util.Date;

import lombok.Data;

@Data
public class NotificationDTO {
	private Long id;
	private String notificationTitle;
	private String notificationSubtitle;
	private String notificationLink;
	private String notificationUploadedBy;
	private Date notificationUploadedOn;
}
