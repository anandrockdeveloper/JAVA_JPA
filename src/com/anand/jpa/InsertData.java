package com.anand.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JpaProject" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      PersonTable person = new PersonTable( ); 
	      //person.setPersonID(3);
	      person.setAddress("melbourne");
	      person.setCity("Uptown");
	      person.setFirstName("che");
	      person.setLastName("shru");
	      
	      entitymanager.persist( person );
	      
	      PersonTable person2 = new PersonTable( ); 
	      person2.setAddress("USA");
	      person2.setCity("NY");
	      person2.setFirstName("kar");
	      person2.setLastName("Meg");
	      
	      entitymanager.persist( person2 );
	      
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      emfactory.close( );
	      System.out.println("complete");
	}
}