package alauddin.archerstudio.javaTests;

import static org.junit.Assert.*;

import org.junit.Test;

import alauddin.archerstudio.beans.Person;
import alauddin.archerstudio.dao.PersonDao;

public class PersonDaoTest {

	private static PersonDao dao = new PersonDao();
	
	@Test
	public void userIdTest() {
		Person person = null;
		
		dao.open();
		person = dao.getPerson(50);
		dao.close();
		assertNotNull(person);
	}
	
	@Test
	public void nameTest(){
		Person p1 = null, p2 = null;
		
		dao.open();
		p1 = dao.getPerson("JC", "Denton");//registered user
		p2 = dao.getPerson("John", "Doe");//not a user
		dao.close();
		
		assertNotNull(p1);
		assertNull(p2);
	}

}
