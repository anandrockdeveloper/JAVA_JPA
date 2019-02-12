package com.anand.jpacollection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JpaProject" );

		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );

		List<PAddress> PAddressList= new ArrayList<PAddress>();

		PAddress a1=new PAddress();  
		a1.setPincode(201301);  
		a1.setCity("Noida");  
		a1.setState("Uttar Pradesh");
		PAddressList.add(a1);

		PAddress a2=new PAddress();  
		a2.setPincode(302001);  
		a2.setCity("Jaipur");  
		a2.setState("Rajasthan");
		PAddressList.add(a2);

		PersonalDetails details= new PersonalDetails();
		details.setFirstName("Anand");
		details.setLastName("Paad");
		details.setAddress(PAddressList);

		entitymanager.persist( details );

		entitymanager.getTransaction().commit();
		entitymanager.close( );
		emfactory.close( );
		System.out.println("complete");




	}



}
