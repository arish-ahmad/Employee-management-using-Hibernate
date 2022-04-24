package in.arish;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class AddEmployee 
{
    public static void main( String[] args )
    {
        System.out.println( "Connecting to database!" );
        
        Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("Connection created");
        
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        
        System.out.println("Employee name: ");
        String tempName = sc.nextLine();
        emp1.setEmpName(tempName);
        
        System.out.println("Employee email: ");
        String tempEmail = sc.nextLine();
        emp1.setEmail(tempEmail);
        
        
        System.out.println("Employee Mobile no: ");
        String tempMob = sc.nextLine();
        emp1.setEmpMob(tempMob);
        
        System.out.println("Employee Address: ");
        String tempAdd= sc.nextLine();
        emp1.setEmpAdd(tempAdd);
        
        if (tempName!=null || tempEmail!=null || tempAdd!=null || tempMob!=null) {
        	session.save(emp1);
        	tx.commit();
        	session.close();
        	sc.close();
        }
        else {
        	System.out.println("values can't be null");
        }
        
        
        		
    }
}
