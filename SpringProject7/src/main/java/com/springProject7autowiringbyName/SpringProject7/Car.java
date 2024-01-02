package com.springProject7autowiringbyName.SpringProject7;

public class Car {
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
