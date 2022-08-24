package com.tns.jpastart.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.jpastart.entities.Department;
import com.tns.jpastart.entities.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Department department=new Department();
		department.setId(1);
		department.setName("CS");
		
		Department department1=new Department();
		department1.setId(2);
		department1.setName("MECH");
		
		Employee employee1=new Employee();
		employee1.setEid(110);
		employee1.setEname("John");
		employee1.setEsalary(5000);
		
		Employee employee2=new Employee();
		employee2.setEid(111);
		employee2.setEname("Snow");
		employee2.setEsalary(4000);
		
		Employee employee3=new Employee();
		employee3.setEid(210);
		employee3.setEname("James");
		employee3.setEsalary(3000);
		
		Employee employee4=new Employee();
		employee4.setEid(211);
		employee4.setEname("Ash");
		employee4.setEsalary(3000);
		
		department.addEmployee(employee1);
		department.addEmployee(employee2);
		department1.addEmployee(employee3);
		department1.addEmployee(employee4);
		
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		
		em.getTransaction().commit();

	}

}
