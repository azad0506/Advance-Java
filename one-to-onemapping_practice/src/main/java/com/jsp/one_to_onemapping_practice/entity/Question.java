package com.jsp.one_to_onemapping_practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
	@Id
	private int question_id;
    private	String question;
	
    @OneToOne
    private Answer answer;

}
