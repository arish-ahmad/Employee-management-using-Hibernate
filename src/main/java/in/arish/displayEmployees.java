package in.arish;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class displayEmployees{
public static void main(String[] args) {
    List<Employee> employees = null;
    System.out.println( "Connecting to database!" );
        
    Configuration cfg = new  Configuration();
    cfg.configure("hibernate.cfg.xml");
    
    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx = session.beginTransaction();
    System.out.println("Connection created");

    employees = session.createQuery("from Employee").list();
    for ( Employee  empl:employees ){
        System.out.println("Employee "+empl.empId);
        System.out.println("Employee name : "+empl.empName);
        System.out.println("Employee email : "+empl.email);
        System.out.println("Employee address : "+empl.empAdd);
        System.out.println("Employee mobile : "+empl.empMob);
        System.out.println("--------------------------------");
    }
}
}