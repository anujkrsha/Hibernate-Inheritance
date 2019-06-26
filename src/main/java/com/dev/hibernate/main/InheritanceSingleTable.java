package com.dev.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.hibernate.model.Employee;
import com.dev.hibernate.model.Person;
import com.dev.hibernate.util.HibernateUtil;

public class InheritanceSingleTable {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		 session.beginTransaction();
		 
		 Person person = new Person("Steven","Balmer");
		 session.save(person);

			Employee employee = new Employee("James", "Gosling", "Marketing", new Date());
			session.save(employee);
			
			session.getTransaction().commit();
			HibernateUtil.getSessionFactory().close();
	}

}
