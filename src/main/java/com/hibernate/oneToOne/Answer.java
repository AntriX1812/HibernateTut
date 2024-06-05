package com.hibernate.oneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {

	@Id
	private int ans_id;
	private String answer;
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
