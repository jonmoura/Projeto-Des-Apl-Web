package br.com.jonathan.faculdade.service;

import java.util.List;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jonathan.faculdade.repository.FaculdadeRepository;
import br.com.jonathan.faculdade.model.Aluno;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Table(name = "Aluno")
public class FaculdadeService {
	
	@Autowired
	private FaculdadeRepository repository;
	
	public List<Aluno> alunos() {
		return this.repository.findAll();
	}
	
	public void save(Aluno aluno) {
		this.repository.save(aluno);
		
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
	
	public Aluno getNome(String nome) {
		return this.repository.procurarNome(nome);
	}
	
	public Aluno getCurso(String curso) {
		return this.repository.procurarCurso(curso);
	}
	
	public void alterar(Long id, Aluno aluno) {
		this.repository.atualizar(id, aluno);
	}
}

