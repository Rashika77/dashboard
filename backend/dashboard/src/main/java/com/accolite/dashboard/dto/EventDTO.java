package com.accolite.dashboard.dto;

import java.util.Date;

import lombok.Data;

@Data
public class EventDTO {
	private Long id;
	private String eventTitle;
	private String eventSubtitle;
	private String eventLink;
	private String eventUploadedBy;
	private Date eventUploadedOn;
}
