package com.hibernate.embedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration conf     = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		//Creating Objects
		
		
		Locker locker = new Locker();
		locker.setLockerNum(1001);
		locker.setLokcerName("New Divine");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(1001);
		emp1.setEmpName("Anaisha");
		emp1.setLocker(locker);
		session.persist(emp1);
		tx.commit();
		if(null != session)
			session.close();
		
	}

}
