package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {

	private long id;
	private String firstname;
	private String name;
	private String tel;
	private String mail;
	public Collection<Sport> sports;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@ManyToMany
	public Collection<Sport> getSports() {
		return sports;
	}
	public void setSports(Collection<Sport> sports) {
		this.sports = sports;
	}
	public Person() {
		
	}
	public Person(String firstname, String name) {
		this.firstname = firstname;
		this.name = name;
	}
	
}
