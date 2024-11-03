package com.jsp.one_to_onemapping_practice;

import com.jsp.one_to_onemapping_practice.entity.Answer;
import com.jsp.one_to_onemapping_practice.entity.Question;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DisplayQuestionAnswer {
	public static void main(String[] args) {

        System.out.println( "Hello World!" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	int question_id=123;
    	Question q1 = em.find(Question.class, question_id);// for read find
		
    	if(q1!=null) {
    		System.out.println(q1);
    	}
		
	}
//	public Question getQuestionById(int id) {
//		Question q1 = em.find(Question.class, id);// for read find
//		return q1;
//		
//	}

}
