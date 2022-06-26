package builder;

import entities.Address;
import entities.Person;

public class PersonBuilder {

	private Person person;

	public PersonBuilder() {
		this.person = new Person();
	}

	public PersonBuilder builder() {
		return new PersonBuilder();
	}

	public PersonBuilder withName(String name) {
		this.person.setName(name);
		return this;
	}

	public PersonBuilder withTelephone(String Telephone) {
		this.person.setTelephone(Telephone);
		return this;
	}

	public PersonBuilder withAdrress(String street, String number_compl, String city, String state, String country) {
		this.person.setAddress(new Address(street, number_compl, city, state, country));
		return this;
	}

	public Person build() {
		return this.person;
	}

}
