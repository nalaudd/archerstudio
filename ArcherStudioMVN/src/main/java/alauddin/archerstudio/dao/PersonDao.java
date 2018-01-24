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
	 * @return person object or null
	 */
	public Person getPerson(int userId){
		Person p = null;
		Query q = session.createQuery("FROM Person WHERE userId = ?");
		q.setParameter(0, userId);
		
		p = (Person) q.uniqueResult();
		
		return p;
	}
	
	/**
	 * Takes in the arguments of a last name and first name to return a person with those fields.
	 * If no such person found then null is returned 
	 * @param fname
	 * @param lname
	 * @return person object or null
	 */
	public Person getPerson(String fname, String lname){
		Person p = null;
		Query q = session.createQuery("FROM Person WHERE fname = ? and lname = ?");
		
		q.setParameter(0, fname);
		q.setParameter(1, lname);
		p = (Person) q.uniqueResult();
		
		return p;
	}
}
