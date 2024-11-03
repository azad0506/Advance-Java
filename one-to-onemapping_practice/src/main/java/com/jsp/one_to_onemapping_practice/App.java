package com.jsp.one_to_onemapping_practice;

import com.jsp.one_to_onemapping_practice.entity.Answer;
import com.jsp.one_to_onemapping_practice.entity.Question;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	
    	Answer a1=new Answer(344, "c++ is programming");
    	Question q1=new Question(124, "what is c++", a1);
    	
    	
    	et.begin();
		em.persist(q1);
		em.persist(a1);
		et.commit();
    }
}
