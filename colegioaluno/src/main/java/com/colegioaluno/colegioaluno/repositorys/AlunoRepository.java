package com.colegioaluno.colegioaluno.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioaluno.colegioaluno.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
