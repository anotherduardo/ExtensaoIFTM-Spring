package br.edu.iftm.extensaoSTS.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import br.edu.iftm.extensaoSTS.domain.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Integer>{
	
	// Colocamos aqui somente o que queremos de diferenete
	// JpaRepository já contém um DAO implementado.
	
    //@Query("Select a from Atividade a where a.nome like %:nome%")
	// Containing é convensão: Automaticamente faz um like na query.
    public List<Atividade> findByNomeContaining(@Param("nome") String nome);
    
    
    /*public ResponseEntity<?> deleteAtividade();*/
 
    
    
}//fim[AtividadeRepository]