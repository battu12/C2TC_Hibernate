package com.tns.jionedtable.clients;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.joinedtable.entities.Employee;
import com.tns.joinedtable.entities.Manager;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("James");
		employee.setSalary(25000);
		em.persist(employee);
		
		//create one manager
		Manager manager3 = new Manager();
		manager3.setName("John Snow");
		manager3.setSalary(40000);
		manager3.setDepartmentName("Developer");
		em.persist(manager3);
			
		em.getTransaction().commit();
		System.out.println("Added one employee and manager to database.");
	}
}
