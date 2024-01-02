package Poly.Hybrid;

public class Development {
void project(SoftwareEngineer se) {
	se.attendMeeting();
	se.testCode();
	if(se instanceof JavaDeveloper) {
		((JavaDeveloper)(se)).doBackEndProject();
		((JavaDeveloper)(se)).learnJava();
	}
	else if(se instanceof PythonDeveloper) {
	((PythonDeveloper)(se)).doBackEndProject();
	((PythonDeveloper)(se)).learnPython();	
	}
	else if(se instanceof DatabaseDeveloper) {
		((DatabaseDeveloper)(se)).doBackEndProject();
		((DatabaseDeveloper)(se)).learnSql();
	}
	else if(se instanceof BackendDeveloper) {
		((BackendDeveloper)(se)).doBackEndProject();
	}
	
	

}
}

