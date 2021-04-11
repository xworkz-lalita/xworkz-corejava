package com.xworkz.computer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="computer")
@NamedQueries({@NamedQuery(name="findByName", query = "select COMPUTER from ComputerEntity COMPUTER where COMPUTER.name=:nm"),
	@NamedQuery(name="deleteById",query="delete ComputerEntity COMPUTER where COMPUTER.id=:id "),
	@NamedQuery(name="getAll",query="select COMPUTER from ComputerEntity COMPUTER ")})
public class ComputerEntity {
@Id
@Column(name="ID")
private int id;
@Column(name="NAME")
private String name;
@Column(name="BRAND")
private String brand;
@Column(name="PRICE")
private String price;
@Column(name="TYPE")
private String type;
/**
 * @param id
 * @param name
 * @param brand
 * @param price
 * @param type
 */
public ComputerEntity(int id, String name, String brand, String price, String type) {
	super();
	this.id = id;
	this.name = name;
	this.brand = brand;
	this.price = price;
	this.type = type;
}

}
