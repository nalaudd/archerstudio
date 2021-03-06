package alauddin.archerstudio.javaTests;

import static org.junit.Assert.*;

import org.junit.Test;

import alauddin.archerstudio.beans.User;
import alauddin.archerstudio.dao.UserDao;

public class UserDaoTest {
	
	private static UserDao dao = new UserDao();
	
	@Test
	public void loginTest() {
		dao.open();
		User user = dao.login("jcd", "bionicman");
		dao.close();
		assertNotNull(user);
	}
	
	@Test
	public void createUserTest(){
		dao.open();
		
		dao.createUser("jmanderley", "knight_killer", "Joseph", "Manderley", 23, "1992-10-15");
		
		User user = dao.login("jmanderley", "knight_killer");
		
		assertNotNull(user);
		
		dao.close();
	}
}
