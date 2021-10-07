package br.com.jonathan.faculdade.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.jonathan.faculdade.service.FaculdadeService;
import br.com.jonathan.faculdade.model.Aluno;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private final FaculdadeService service = new FaculdadeService();
	
	@GetMapping
	public List<Aluno> pesquisarAluno() {
		return this.service.alunos();
	}
	
	@GetMapping("/nome")
	public Aluno encontrarNome(@RequestParam("nome") String nome) {
		return this.service.getNome(nome);
	}
	
	@GetMapping("/curso")
	public Aluno encontrarCurso(@RequestParam("curso") String curso) {
		return this.service.getCurso(curso);
	}
	
	@PostMapping
	public String cadastrarAluno(@RequestBody Aluno aluno) {
		this.service.save(aluno);
		return "Aluno salvo com sucesso";
	}
	
	@DeleteMapping("/id")
	public String deletarAluno(@PathVariable("id") Long id) {
		this.service.remove(id);
		return "Aluno excluído com sucesso";
	}
	
	@PutMapping
	public String put() {
		return "método put";
	}

}
