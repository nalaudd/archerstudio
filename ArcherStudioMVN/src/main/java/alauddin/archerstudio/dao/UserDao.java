package alauddin.archerstudio.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import alauddin.archerstudio.beans.User;
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
	 * @return
	 */
	public User login(String username, String password){
		User user = null;
		Query q = session.createQuery("FROM users WHERE username = ? AND password = ?");
		
		q.setParameter(0, username);
		q.setParameter(1, password);
		
		user = (User) q.uniqueResult();
		
		return user;
	}
	
	/**
	 * closes an open session
	 */
	public void close(){
		session.close();
	}
}
