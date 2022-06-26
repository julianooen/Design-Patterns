package application;

import builder.PersonBuilder;
import entities.Person;

public class Main {

	public static void main(String[] args) {
		Person newPesron = new PersonBuilder().builder().withName("fulana").withTelephone("(31) 3309-9852")
				.withAdrress("Alvimar Rezende", "20 casa A Sanata Maragrida Barreiro - 30640-210", "Belo Horizonte", "MG", "Brasil").build();
		
		
		System.out.println(newPesron);

	}

}
