package com.accolite.dashboard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * 
 * @author rashika.devadiga
 *
 */

@Data
@Entity(name = "notification")
@Table(name = "notfication")
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String notificationTitle;

	@Column(name = "subtitle")
	private String notificationSubtitle;

	@Column(name = "link")
	private String notificationLink;

	@Column(name = "uploaded_by")
	private String notificationUploadedBy;

	@Column(name = "uploaded_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date notificationUploadedOn;
}
