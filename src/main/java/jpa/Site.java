package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Site {
	
	private long id;
	private String name;
	private Department dep;
	
	/**
	 * 
	 * @return id of the site.
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	/**
	 * 
	 * @param id of the site.
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * 
	 * @return name of the site.
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name of the site.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return department the site is located in.
	 */
	@ManyToOne
	public Department getDep() {
		return dep;
	}
	/**
	 * 
	 * @param dep : department the site is located in.
	 */
	public void setDep(Department dep) {
		this.dep = dep;
	}
	
}
