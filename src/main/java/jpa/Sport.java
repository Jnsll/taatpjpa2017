package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sport {

	private long id;
	private String title;
	private Collection<Person> pratiquants;
	
	/**
	 * 
	 * @return id of the sport.
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	/**
	 * 
	 * @param id of the sport.
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * 
	 * @return title of the sport.
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 
	 * @param title of the sport.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 
	 * @return people practising the sport.
	 */
	@ManyToMany(mappedBy="sports")
	public Collection<Person> getPratiquants() {
		return pratiquants;
	}
	/**
	 * 
	 * @param pratiquants : people practising the sport.
	 */
	public void setPratiquants(Collection<Person> pratiquants) {
		this.pratiquants = pratiquants;
	}
	public Sport() {
		
	}
	
}
