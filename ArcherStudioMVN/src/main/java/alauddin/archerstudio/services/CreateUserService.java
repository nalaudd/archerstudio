package alauddin.archerstudio.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import alauddin.archerstudio.beans.UserCreation;
import alauddin.archerstudio.dao.UserDao;

@Path("/create_user")
public class CreateUserService {
	
	/**
	 * Takes in a user creation object that takes its parameters for storing
	 * a new user.
	 * @param uc
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/register")
	public void register(UserCreation uc){
		UserDao dao = new UserDao();
		
		dao.open();
		
		dao.createUser(uc.getUsername(), uc.getPassword(), uc.getFname(), uc.getLname(), uc.getAge(), uc.getBirthday());
		
		dao.close();
	}
	
}
