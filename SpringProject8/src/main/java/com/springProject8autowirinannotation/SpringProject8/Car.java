package com.springProject8autowirinannotation.SpringProject8;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
Driver dr;

public Car() {
	super();
}

public Car(Driver dr) {
	super();
	this.dr = dr;
}

public Driver getDr() {
	return dr;
}

public void setDr(Driver dr) {
	this.dr = dr;
}

@Override
public String toString() {
	return "Car [dr=" + dr + "]";
}

}
