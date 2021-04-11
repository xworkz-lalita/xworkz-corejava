package com.xworkz.web.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString
@NoArgsConstructor
@Table(name = "registration")
@NamedQueries({
		@NamedQuery(name = "findByName", query = "select register from RegistrationEntity register where register.name=:name "),
		@NamedQuery(name = "findByEmail", query = "select register from RegistrationEntity register where register.email=:email"),
		@NamedQuery(name = "findAll", query = "select register from RegistrationEntity register") })
public class RegistrationEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PHONE_NO")
	private String phoneNo;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "PROJECT")
	private String project;

	public RegistrationEntity(String name, String phoneNo, String email, String company, String project) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.company = company;
		this.project = project;
	}

}
