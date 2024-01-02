package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the temperature in fahrenheit");
double fahrenheit=scan.nextDouble();
TemperatureConverter temperatureConverter = new TemperatureConverter();

System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
	}

}
