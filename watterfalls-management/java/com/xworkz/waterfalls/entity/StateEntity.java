package com.xworkz.waterfalls.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "state")
@NamedQueries({
	@NamedQuery(name = "findAll", query = "select state from StateEntity state"),
	@NamedQuery(name = "findAllIds", query = "select state.id from StateEntity state "),
	@NamedQuery(name = "findAllIdAndName", query = "select state.id,state.name from StateEntity state "),
	@NamedQuery(name = "deleteById", query = "delete StateEntity state where state.id=:id"),
	@NamedQuery(name = "updatePopulationByName", query = "update StateEntity state set state.population=:pop where state.name=:nm")
})
public class StateEntity {
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LANGUAGE")
	private String language;
	@Column(name = "NO_OF_POPULATION")
	private int population;
	@Column(name = "NO_OF_DISTRICTS")
	private int noOfDistricts;
	public StateEntity() {
		System.out.println("created my state entity" +this.getClass().getSimpleName());
	}
	/**
	 * @param name
	 * @param language
	 * @param population
	 * @param noOfDistricts
	 */
	public StateEntity(String name, String language, int population, int noOfDistricts) {
		super();
		this.name = name;
		this.language = language;
		this.population = population;
		this.noOfDistricts = noOfDistricts;
	}

	
}

