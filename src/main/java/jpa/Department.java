package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	private long id;
	private String name;
	private Collection<Site> lieux;
	
	/**
	 * 
	 * @return id of the department.
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	/**
	 * 
	 * @param id of department.
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * 
	 * @return name of department.
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name of department.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return sites located in a department.
	 */
	@OneToMany(mappedBy="dep")
	public Collection<Site> getLieux() {
		return lieux;
	}
	/**
	 * 
	 * @param lieux located in a department.
	 */
	public void setLieux(Collection<Site> lieux) {
		this.lieux = lieux;
	}

	public Department() {
		
	}
	
	
}
