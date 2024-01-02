package Poly.Hybrid;

public class SoftwareApp {

	public static void main(String[] args) {
		BackendDeveloper be=new BackendDeveloper();
		DatabaseDeveloper dd=new DatabaseDeveloper();
		JavaDeveloper jd=new JavaDeveloper();
		PythonDeveloper pd=new PythonDeveloper();
		Development d=new Development();
		d.project(dd);
		d.project(be);
		d.project(jd);
		d.project(pd);

	}

}
