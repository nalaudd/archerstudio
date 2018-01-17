package alauddin.archerstudio.javaTests;

import static org.junit.Assert.*;

import org.junit.Test;

import alauddin.archerstudio.beans.User;
import alauddin.archerstudio.dao.UserDao;

public class UserDaoTest {

	@Test
	public void test() {
		UserDao dao = new UserDao();
		dao.open();
		User user = dao.login("anavarre", "scryspc");
		dao.close();
		assertNotNull(user);
	}

}
