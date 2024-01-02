package com.aggregation;

public class AirlineApp {
public static void psvm() {
	// TODO Auto-generated method stub
Pilot p=new Pilot("Raju");
p.fly();
Airline ar=new Airline("AirIndia",p);
ar.operations();
System.out.println("Destroying airline object");
ar=null;
ar.operations();
p.fly();
}
}
