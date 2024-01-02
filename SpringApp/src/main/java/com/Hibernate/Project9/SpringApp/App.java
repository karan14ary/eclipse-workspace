package com.Hibernate.Project9.SpringApp;

public class App 
{
    public static void main( String[] args )
    {
        JavaTrainer jt=new JavaTrainer();
        PythonTrainer pt=new PythonTrainer();
        DBTrainer dbt=new DBTrainer();
        activities(jt);
        activities(pt);
        activities(dbt);
        
    }
    public static void activities(Trainer tr) {
    	tr.teach();
    	tr.takeAttendance();
    }
}
