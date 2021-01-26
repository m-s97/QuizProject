package com.example.demo.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.QuizRepo;
import com.example.demo.model.Quiz;

@Controller
public class QuizController {
	@Autowired
	QuizRepo q;
	
	@RequestMapping("/api/quiz/{quiz_id}")
	public Optional<Quiz> getSpecificQuiz(@PathVariable("quiz_id") int id) {
		System.out.println("Return Quiz with id "+id);
		return q.findById(id);
	}
	
	@PostMapping("/api/quiz")
	public Quiz createQuiz(@RequestBody Quiz quizVal){
		System.out.print("Create Quiz method");
		q.save(quizVal);
		return quizVal;
	}
}

