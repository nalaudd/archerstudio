package alauddin.archerstudio.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	
	@Id
	@SequenceGenerator(sequenceName="PERSON_SEQ", name="PERSON_SEQ")
    @GeneratedValue(generator="PERSON_SEQ", strategy=GenerationType.SEQUENCE)
	private int userId;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private int age;
	
	@Column
	private Date birthday;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
