package alauddin.archerstudio.javaTests;

import static org.junit.Assert.*;

import org.junit.Test;

import alauddin.archerstudio.beans.CustomSchedule;
import alauddin.archerstudio.beans.WorkSchedule;
import alauddin.archerstudio.dao.ScheduleDao;

public class ScheduleDaoTest {
	
	private static ScheduleDao dao = new ScheduleDao();
	
	@Test
	public void test() {
		WorkSchedule ws = null;
		CustomSchedule cs = null;
		
		dao.open();
		
		ws = dao.getWorkSchedule(50);
		cs = dao.getCustomSchedule(50);
		
		dao.close();
		
		assertNotNull(ws);
		assertNotNull(cs);
	}

}
