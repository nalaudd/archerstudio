package alauddin.archerstudio.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.Transaction;

import alauddin.archerstudio.beans.User;
import alauddin.archerstudio.util.HibernateUtil;

@Path("/User")
public class UpdateInfoService {
	
	public static Session session;
	
	/**
	 * Takes an input of a user object and updates its changes in the
	 * table
	 * @param user
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/update")
	public void update(User user){
		session = new HibernateUtil().getSession();
		Transaction tx = session.beginTransaction();
		session.update(user.getCs());
		session.update(user.getWs());
		session.update(user.getPerson());
		session.update(user);
		tx.commit();
		session.close();
	}
	
	/**
	 * Takes the user objects and saves its information into the appropriate tables as a new
	 * user.
	 * @param user
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public void createUser(User user){
		session = new HibernateUtil().getSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		session.save(user.getPerson());
		session.save(user.getCs());
		session.save(user.getWs());
		tx.commit();
		session.close();
	}
}
