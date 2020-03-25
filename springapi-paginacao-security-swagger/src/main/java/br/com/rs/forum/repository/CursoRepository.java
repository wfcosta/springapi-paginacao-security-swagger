package br.com.rs.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rs.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
