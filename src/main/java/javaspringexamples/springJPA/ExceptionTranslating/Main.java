package javaspringexamples.springJPA.ExceptionTranslating;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Conf.class);

		PersonDAO dao = (PersonDAO) applicationContext.getBean("personDao");
		// Creating person object
		Person person = new Person();
		person.setFirstName(null);
		person.setLastName("KOLOBANE");

		// Spring handles different types of data access exceptions thrown from the data
		// access layer, and translates them into
		// org.springframework.dao.DataAccessException.
		try {
			// Saving person
			dao.save(person);
		} catch (DataAccessException dae) {
			System.out.println("Exception translated by Spring and handled");
		}
	}
}