package com.anand.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindData {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JpaProject" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      
	      PersonTable person=entitymanager.find(PersonTable.class, 1);
	      System.out.println(person.getAddress()+" "+person.getCity()+" "+person.getFirstName());
	      
	      entitymanager.close( );
	      emfactory.close( );
	      System.out.println("complete");
	}

}
