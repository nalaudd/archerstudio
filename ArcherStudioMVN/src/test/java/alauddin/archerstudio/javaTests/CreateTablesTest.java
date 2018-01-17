package alauddin.archerstudio.javaTests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import alauddin.archerstudio.beans.CustomSchedule;
import alauddin.archerstudio.beans.Person;
import alauddin.archerstudio.beans.User;
import alauddin.archerstudio.beans.WorkSchedule;
import alauddin.archerstudio.util.HibernateUtil;

public class CreateTablesTest {

	public static void main(String[] args) {
		Session session = new HibernateUtil().getSession();
		Transaction tx = null;
		User user = new User();
		
		user.setUsername("anavarre");
		user.setPassword("scryspc");
		user.setCs(new CustomSchedule());
		user.setWs(new WorkSchedule());
		user.setPerson(new Person());
		user.getPerson().setFname("Anna");
		user.getPerson().setLname("Navarre");
		
		tx = session.beginTransaction();

		session.save(user);
		session.save(user.getCs());
		session.save(user.getWs());
		session.save(user.getPerson());
		
		tx.commit();
		session.close();
	}

}
