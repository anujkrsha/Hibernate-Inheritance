package com.dev.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.hibernate.model.Employee;
import com.dev.hibernate.model.Owner;
import com.dev.hibernate.model.Person;
import com.dev.hibernate.util.HibernateUtil;

public class InheritanceJoined {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		
		Person person = new Person("Steve", "Balmer");
		session.save(person);

		Employee employee = new Employee("James", "Gosling", "Marketing", new Date());
		session.save(employee);

		Owner owner = new Owner("Bill", "Gates", 300L, 20L);
		session.save(owner);

		
		session.getTransaction().commit();
		session.close();
	}

}
