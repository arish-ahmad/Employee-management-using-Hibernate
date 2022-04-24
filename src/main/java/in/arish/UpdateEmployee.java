package in.arish;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
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
			System.out.println("New email: ");
			sc.nextLine();
			String tempEmail = sc.nextLine();
			
			/*emp.setEmail(tempEmail);
			session.update(emp);*/
			session.createQuery("update from Employee where id ="+id+" set email="+tempEmail).executeUpdate();
			tx.commit();
			System.out.println("Employee Data update successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	
	}
}
