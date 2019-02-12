package com.anand.jpacollection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.anand.jpa.PersonTable;

public class ReadData {
	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JpaProject" );

		EntityManager entitymanager = emfactory.createEntityManager( );
		PersonalDetails person=entitymanager.find(PersonalDetails.class, 151);
		
//		for(PAddress p:person.getAddress())
//		{
//			System.out.println(p.getCity()+" "+p.getPincode()+" "+p.getState());
//		}
		System.out.println(person.getAddress().size()+" "+" "+person.getFirstName());
	}

}
