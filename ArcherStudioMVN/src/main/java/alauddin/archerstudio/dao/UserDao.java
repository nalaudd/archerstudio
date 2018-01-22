package alauddin.archerstudio.dao;

import java.sql.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import alauddin.archerstudio.beans.CustomSchedule;
import alauddin.archerstudio.beans.Person;
import alauddin.archerstudio.beans.User;
import alauddin.archerstudio.beans.WorkSchedule;
import alauddin.archerstudio.util.HibernateUtil;

public class UserDao {
	
	private static Session session;
	
	/**
	 * Opens a session for dao
	 */
	public void open(){
		session = new HibernateUtil().getSession();
	}
	
	/**
	 * Returns a user object if the username and password match
	 * @param username
	 * @param password
	 * @return User
	 */
	public User login(String username, String password){
		User user = null;
		Query q = session.createQuery("FROM User WHERE username = ? AND password = ?");
		
		q.setParameter(0, username);
		q.setParameter(1, password);
		
		user = (User) q.uniqueResult();
		
		return user;
	}
	
	/**
	 * Takes the inputs needed for a user and saves their data into tables
	 * @param username, password, fname, lname, age, birthday
	 */
	public void createUser(String username, String password, String fname, String lname, int age, Date birthday){
		User user = new User();
		user.setCs(new CustomSchedule());
		user.setPerson(new Person());
		user.setWs(new WorkSchedule());
		
		Transaction tx = null;
		
//		set user's fields
		user.setUsername(username);
		user.setPassword(password);
		
//		set user's personal info
		user.getPerson().setFname(fname);
		user.getPerson().setLname(lname);
		user.getPerson().setBirthday(birthday);
		user.getPerson().setAge(age);
		
//		save user into tables
		tx = session.beginTransaction();
		
		session.save(user.getPerson());
		session.save(user.getWs());
		session.save(user.getCs());
		session.save(user);
		tx.commit();
		
	}
	
	/**
	 * closes an open session
	 */
	public void close(){
		session.close();
	}
}
