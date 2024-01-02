package com.String.Mutable;

public class P1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Java");
		System.out.println(sb);
		//Java
		sb.append("SQL");
		System.out.println(sb);
		//JavaSQL
		sb.append("Python");
		System.out.println(sb);
		//JavaSQLPython
		sb.append("Web");
		System.out.println(sb);
		//JavaSQLPythonWeb		
		sb.append("Aptitude");
		System.out.println(sb);
		//JavaSQLPythonWebAptitude


	}

}
