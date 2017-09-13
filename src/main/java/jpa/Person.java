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
	
	/**
	 * 
	 * @return id of the person.
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	/**
	 * 
	 * @param id of the person.
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * 
	 * @return firstname of the person.
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * 
	 * @param firstname of the person.
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * 
	 * @return name of the person.
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name of the person.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return phone number of the person.
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 
	 * @param tel : phone number of the person.
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * 
	 * @return mail of the person.
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * 
	 * @param mail of the person.
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * 
	 * @return sports the person is practising.
	 */
	@ManyToMany
	public Collection<Sport> getSports() {
		return sports;
	}
	/**
	 * 
	 * @param sports the person is practising.
	 */
	public void setSports(Collection<Sport> sports) {
		this.sports = sports;
	}
	public Person() {
		
	}
	/**
	 * 
	 * @param firstname
	 * @param name
	 */
	public Person(String firstname, String name) {
		this.firstname = firstname;
		this.name = name;
	}
	
}
