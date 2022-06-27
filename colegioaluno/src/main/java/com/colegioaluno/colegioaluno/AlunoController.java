package com.colegioaluno.colegioaluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegioaluno.colegioaluno.entity.Aluno;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private JpaRepository repos;
	
	@GetMapping
	public List<Aluno> findAll(){
		List<Aluno> rest = repos.findAll();
		   return rest;
	}
	
	@GetMapping(value = "/{id}")
	public Aluno findById(@PathVariable Long id) {
		Aluno rest = (Aluno) repos.findById(id).get();
		  return rest;
		
	}

}
