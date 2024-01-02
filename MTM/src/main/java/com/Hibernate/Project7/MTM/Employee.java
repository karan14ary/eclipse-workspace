package com.Hibernate.Project7.MTM;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int e_id;
	String e_name;
	String e_team;
	@ManyToMany
	List <Technology>technology;
	public Employee() {

	}
	public Employee(int e_id, String e_name, String e_team, List<Technology> technology) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_team = e_team;
		this.technology = technology;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_team() {
		return e_team;
	}
	public void setE_team(String e_team) {
		this.e_team = e_team;
	}
	public List<Technology> getTechnology() {
		return technology;
	}
	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}

}
