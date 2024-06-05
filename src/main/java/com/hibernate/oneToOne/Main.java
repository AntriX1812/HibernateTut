package com.hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
	    SessionFactory sf    = config.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    Answer ans = new Answer();
	    ans.setAns_id(101);
	    ans.setAnswer("Java is Programming Language");
	    
	    Question ques = new Question();
	    ques.setQuestionId(301);
	    ques.setQuestion("What is Java");
	    ques.setAnswer(ans);
	    session.persist(ques);
	    session.persist(ans);
	    tx.commit();
	    session.close();
	}
	
   
   
}
