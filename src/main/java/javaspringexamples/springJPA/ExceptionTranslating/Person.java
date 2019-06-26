package javaspringexamples.springJPA.ExceptionTranslating;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	@Basic(optional=false)
	private String firstName;

	private String lastName;

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
