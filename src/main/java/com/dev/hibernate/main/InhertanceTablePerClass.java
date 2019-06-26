package com.dev.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.hibernate.model.Employee;
import com.dev.hibernate.model.Owner;
import com.dev.hibernate.model.Person;
import com.dev.hibernate.util.HibernateUtil;

public class InhertanceTablePerClass {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		 session.beginTransaction();
		 
		 Person person = new Person("Steve", "Balmer");
			person.setPersonId(1L);
			session.save(person);

			Employee employee = new Employee("James", "Gosling", "Marketing", new Date());
			employee.setPersonId(2L);
			session.save(employee);

			Owner owner = new Owner("Bill", "Gates", 300L, 20L);
			owner.setPersonId(3L);
			session.save(owner);
			
			session.getTransaction().commit();
			HibernateUtil.getSessionFactory().close();
	}

}
