package com.hibernate.annotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
       Configuration config = new Configuration().configure("hibernate.cfg.xml");
       SessionFactory sf    = config.buildSessionFactory();
       Session session = sf.openSession();
       
       // Create object of Address
       
       Address addr = new Address();
       addr.setCity("Chandigarh");
       addr.setY(100);
       addr.setDate(new java.util.Date());
       
      //Code for Image
       
       FileInputStream  fis = new FileInputStream("D:\\Antriksh\\Antriksh.jpg");
       try {
		   byte [] array = new byte[fis.available()];
		   addr.setImg(array);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       Transaction tx= session.beginTransaction();
       session.persist(addr);
       tx.commit();
       
       //path D:\Antriksh
       session.close();
       
	}

}
