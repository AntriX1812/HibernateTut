package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Configuration config   = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session        session = factory.openSession();
		Student st = session.get(Student.class, 1002);
		System.out.println(st);
		
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
