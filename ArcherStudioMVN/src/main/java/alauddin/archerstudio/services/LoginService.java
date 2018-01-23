package alauddin.archerstudio.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import alauddin.archerstudio.beans.Login;
import alauddin.archerstudio.beans.User;
import alauddin.archerstudio.dao.UserDao;

@Path("login")
public class LoginService {
	
	private static UserDao dao = new UserDao();
	
	/**
	 * The method takes in the log object and verifies the credentials with the
	 * user dao. If the match the method returns a user object 
	 * @param log
	 * @return user or null
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user")
	public final User login(Login log){
		User user = null;
		
		dao.open();
		user = dao.login(log.getUsername(), log.getPassword());
		dao.close();
		
		return user;
	}
	
}
