package com.Hibernate.Project7.MTM;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int t_id;
	String t_name;
	@ManyToMany
	List <Employee>employee;
	public Technology() {

	}
	public Technology(int t_id, String t_name, List<Employee> employee) {
		this.t_id = t_id;
		this.t_name = t_name;
		this.employee = employee;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}