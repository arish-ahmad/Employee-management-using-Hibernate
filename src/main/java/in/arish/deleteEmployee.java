package in.arish;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleteEmployee {

	public static void main(String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		Session session =  null;
		Transaction tx = null;
		Scanner sc = null;
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		System.out.println("Connection created!");
		
		
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			sc = new Scanner(System.in);
			
			System.out.println("Empployee ID:");
			int id = sc.nextInt();
			
			Employee emp = session.get(Employee.class, id);
			System.out.println(emp);
			
			session.delete(emp);
			tx.commit();
			System.out.println("Employee Data delete successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
