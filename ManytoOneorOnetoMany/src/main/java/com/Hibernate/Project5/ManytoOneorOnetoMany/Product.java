package com.Hibernate.Project5.ManytoOneorOnetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	int p_Id;
	String p_Name;
	int p_Cost;
	@ManyToOne
	Customer cst;
	public Product() {

	}
	public Product(int p_Id, String p_Name, int p_Cost, Customer cst) {
		this.p_Id = p_Id;
		this.p_Name = p_Name;
		this.p_Cost = p_Cost;
		this.cst = cst;
	}
	public int getP_Id() {
		return p_Id;
	}
	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}
	public String getP_Name() {
		return p_Name;
	}
	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}
	public int getP_Cost() {
		return p_Cost;
	}
	public void setP_Cost(int p_Cost) {
		this.p_Cost = p_Cost;
	}
	public Customer getCst() {
		return cst;
	}
	public void setCst(Customer cst) {
		this.cst = cst;
	}

}
