package alauddin.archerstudio.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import alauddin.archerstudio.beans.Person;
import alauddin.archerstudio.beans.Schedule;
import alauddin.archerstudio.beans.User;
import alauddin.archerstudio.dao.PersonDao;
import alauddin.archerstudio.dao.ScheduleDao;

@Path("/UserInfo")
public class UserInfoService {
	
	private static PersonDao pdao = new PersonDao();
	private static ScheduleDao sdao = new ScheduleDao();
	
	/**
	 * Based on the user's id the method gives the appropriate personal information
	 * as a Person object
	 * @param user
	 * @return Person or null
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Person")
	public Person getPerson(User user){
		Person person = null;
		
		pdao.open();
		person =  pdao.getPerson(user.getUserId());
		pdao.close();
		
		return person;
	}
	
	/**
	 * Returns schedule based on the user id
	 * @param userId
	 * @return Schedule
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Schedule/{userId}")
	public Schedule getSchedule(@PathParam("userId") int userId){
		Schedule schedule = new Schedule();
		
		sdao.open();
		schedule.setCs(sdao.getCustomSchedule(userId));
		schedule.setWs(sdao.getWorkSchedule(userId));
		sdao.close();
		
		return schedule;
	}

}
