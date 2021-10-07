package br.com.jonathan.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.jonathan.faculdade.model.Aluno;

@Repository
public interface FaculdadeRepository extends JpaRepository<Aluno, Long> {

	public Aluno procurarNome(String nome);

	public Aluno procurarCurso(String curso);

	public void atualizar(Long id, Aluno aluno);
	
}


