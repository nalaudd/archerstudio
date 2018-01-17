package alauddin.archerstudio.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import alauddin.archerstudio.beans.CustomSchedule;
import alauddin.archerstudio.beans.WorkSchedule;
import alauddin.archerstudio.util.HibernateUtil;

public class ScheduleDao {
	
	private static Session session;
	
	/**
	 * Opens a session for dao
	 */
	public void open(){
		session = new HibernateUtil().getSession();
	}
	
	/**
	 * Returns a users work schedule based on the matching user id
	 * @param userId
	 * @return
	 */
	public WorkSchedule getWorkSchedule(int userId) {
		WorkSchedule ws = null;
		Query q = session.createQuery("FROM WorkSchedule WHERE userId = ?");
		q.setParameter(0, userId);
		
		ws = (WorkSchedule) q.uniqueResult();
		
		return ws;
	}
	
	/**
	 * Returns a users custom schedule based on the matching user id
	 * @param userId
	 * @return
	 */
	public CustomSchedule getCustomSchedule(int userId) {
		CustomSchedule cs = null;
		Query q = session.createQuery("FROM CustomSchedule WHERE userId = ?");
		q.setParameter(0, userId);
		
		cs = (CustomSchedule) q.uniqueResult();
		
		return cs;
	}
	
	/**
	 * closes an open session
	 */
	public void close(){
		session.close();
	}
	
}
