package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Quiz;

public interface QuizRepo extends JpaRepository<Quiz,Integer>{
	

}
