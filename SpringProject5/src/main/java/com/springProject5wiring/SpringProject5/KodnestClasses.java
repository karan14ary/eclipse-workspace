package com.springProject5wiring.SpringProject5;

public class KodnestClasses {
Trainer tr;

public KodnestClasses() {
	super();
	// TODO Auto-generated constructor stub
}

public KodnestClasses(Trainer tr) {
	super();
	this.tr = tr;
}

public Trainer getTr() {
	return tr;
}

public void setTr(Trainer tr) {
	this.tr = tr;
}

@Override
public String toString() {
	return "KodnestClasses [tr=" + tr + "]";
}

}
