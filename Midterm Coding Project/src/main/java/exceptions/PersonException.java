package exceptions;

import java.util.Date;

import com.cisc181.core.Person;

public class PersonException extends Exception{
	private Person A;
	public PersonException(Person A) {
		super();
		this.A = A;
	}
}
