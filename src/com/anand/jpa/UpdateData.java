package com.anand.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JpaProject" );

		EntityManager entitymanager = emfactory.createEntityManager( );

		entitymanager.getTransaction( ).begin( );

		PersonTable person=entitymanager.find(PersonTable.class, 1);
		System.out.println(person.getAddress()+" "+person.getCity()+" "+person.getFirstName());

		person.setLastName("Priya");

		person.setFirstName("Deeps");

		entitymanager.persist( person );

		entitymanager.getTransaction( ).commit( );


		entitymanager.close( );
		emfactory.close( );
		System.out.println("complete");
	}

}
