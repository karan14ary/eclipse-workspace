package com.springProject5wiring.SpringProject5;

public class Trainer {
int t_id;
String t_name;
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}
public Trainer(int t_id, String t_name) {
	super();
	this.t_id = t_id;
	this.t_name = t_name;
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
@Override
public String toString() {
	return "Trainer [t_id=" + t_id + ", t_name=" + t_name + "]";
}

}
