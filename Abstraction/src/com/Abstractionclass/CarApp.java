package com.Abstractionclass;

public class CarApp {
public static void main(String[] args) {
	ElectricCar ec=new 	ElectricCar();
	PetrolCar pc=new PetrolCar();
	DieselCar dc=new DieselCar();
	Vechicle v=new Vechicle();
	v.doActivity(ec);
	v.doActivity(pc);
	v.doActivity(dc);
}
}
