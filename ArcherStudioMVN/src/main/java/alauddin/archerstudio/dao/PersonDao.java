package alauddin.archerstudio.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import alauddin.archerstudio.beans.Person;
import alauddin.archerstudio.util.HibernateUtil;

public class PersonDao {
	
	private static Session session = new HibernateUtil().getSession();
	
	/**
	 * Opens a session 
	 */
	public void open(){
		session = new HibernateUtil().getSession();
	}
	
	/**
	 * Closes an open session
	 */
	public void close(){
		session.close();
	}
	
	/**
	 * Gets a person's object which contains users personal information in the person
	 * object. It will only have the first name, last name, age, and birthday
	 * @param userId
	 * @return
	 */
	public Person getPerson(int userId){
		Person p = null;
		Query q = session.createQuery("FROM person WHERE userId = ?");
		q.setParameter(0, userId);
		
		p = (Person) q.uniqueResult();
		
		return p;
	}
}
