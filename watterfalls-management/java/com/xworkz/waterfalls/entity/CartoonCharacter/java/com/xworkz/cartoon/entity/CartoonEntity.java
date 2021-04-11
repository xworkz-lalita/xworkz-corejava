package com.xworkz.cartoon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cartoom")
public class CartoonEntity {
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SHOW_NAME")
	private String showName;
	//@Enumerated(EnumType.STRING)
	@Column(name = "CHANNEL_NAME")
	private ChannelName channelName;
	@Column(name = "LANGUAGE")
	private String language;

	public enum ChannelName {
		Disney, Pogo, Nick, CartoonNetwork, Chintu,Chitti
	}

	public CartoonEntity(String name, String showName, ChannelName channelName, String language) {
		super();
		this.name = name;
		this.showName = showName;
		this.channelName = channelName;
		this.language = language;
	}

}
