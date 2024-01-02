package com.compression;

public class Book {
Page pg;
Book(){
	pg=new Page("Java");
	
}
void read() {
	pg.display();
}
}
