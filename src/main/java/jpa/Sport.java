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
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@ManyToMany(mappedBy="sports")
	public Collection<Person> getPratiquants() {
		return pratiquants;
	}
	public void setPratiquants(Collection<Person> pratiquants) {
		this.pratiquants = pratiquants;
	}
	public Sport() {
		
	}
	
}
