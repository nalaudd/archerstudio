package alauddin.archerstudio.javaTests;

import static org.junit.Assert.*;

import org.junit.Test;

import alauddin.archerstudio.beans.Person;
import alauddin.archerstudio.dao.PersonDao;

public class PersonDaoTest {

	private static PersonDao dao = new PersonDao();
	
	@Test
	public void test() {
		Person person = null;
		
		dao.open();
		person = dao.getPerson(50);
		dao.close();
		assertNotNull(person);
	}

}
