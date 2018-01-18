package alauddin.archerstudio.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * User object that contains the user's username, password, and user ids.
 * The ids point to the work schedule and custom schedule
 * @author Nasir Alauddin
 *
 */
@Entity
@Table(name="Users")
public class User {
	
	@Id
	@SequenceGenerator(sequenceName="USER_SEQ", name="USER_SEQ")
    @GeneratedValue(generator="USER_SEQ", strategy=GenerationType.SEQUENCE)
	private int userId;
	
	@Column(unique = true)
	private String username;
	
	@Column
	private String password;
	
	@OneToOne
	private Person person;
	
	@OneToOne
	private WorkSchedule ws;
	
	@OneToOne
	private CustomSchedule cs;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public WorkSchedule getWs() {
		return ws;
	}

	public void setWs(WorkSchedule ws) {
		this.ws = ws;
	}

	public CustomSchedule getCs() {
		return cs;
	}

	public void setCs(CustomSchedule cs) {
		this.cs = cs;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
