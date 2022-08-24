package com.tns.association.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tns.association.entities.Address;
import com.tns.association.entities.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Student student = new Student();
		
		student.setSname("Bharath");
	
		
		Address homeAddress = new Address();

		homeAddress.setStreet("DVG School");
		homeAddress.setCity("Mulbagal");
		homeAddress.setState("Karnataka");
		homeAddress.setPincode(563131);
		
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
	
		
	}

}


