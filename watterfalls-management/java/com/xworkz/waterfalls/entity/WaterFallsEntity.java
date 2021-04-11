package com.xworkz.waterfalls.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "waterfall")
public class WaterFallsEntity {

	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "HEIGHT")
	private float height;
	@Column(name = "DEPTH")
	private int depth;
	@Column(name = "ELECTRICITY_GENERATED")
	private boolean eletricityGenerated;
	@Column(name = "SOURCE_RIVER")
	private int sourceRiver;
	@Column(name = "ENTRY_FEES")
	private int entryFees;
	@Column(name = "DESTINATION")
	private String destination;
	@Column(name = "RATING")
	private int rating;
	@Column(name = "NO_OF_DEATH")
	private int noOfDeath;
	@Column(name = "NO_OF_VISITORS")
	private int noOfVisitors;

}
