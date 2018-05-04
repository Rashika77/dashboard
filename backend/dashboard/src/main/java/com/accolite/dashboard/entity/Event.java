package com.accolite.dashboard.entity;

import java.sql.Blob;
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
@Entity(name = "event")
@Table(name = "notfication")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String eventTitle;

	@Column(name = "subtitle")
	private String eventSubtitle;

	@Column(name = "link")
	private String eventLink;

	@Column(name = "image")
	private Blob eventImage;

	@Column(name = "uploaded_by")
	private String eventUploadedBy;

	@Column(name = "uploaded_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date eventUploadedOn;

}
