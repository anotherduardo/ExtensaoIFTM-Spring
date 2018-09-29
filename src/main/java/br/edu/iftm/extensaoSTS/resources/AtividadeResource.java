package br.edu.iftm.extensaoSTS.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.edu.iftm.extensaoSTS.domain.Atividade;
import br.edu.iftm.extensaoSTS.services.AtividadeService;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@RestController
@RequestMapping(value="/atividades")
public class AtividadeResource {
	
	@Autowired
	private AtividadeService service;
	
	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Atividade atividade = service.buscar(id);
		return ResponseEntity.ok().body(atividade);
	}
	
	/*
	@RequestMapping(method=RequestMethod.GET)
	public String listar(){
		return "Rest ok";
		
	}//fim[listar]
	*/
	
	/*
	@RequestMapping(method=RequestMethod.GET)
	public List<Atividade> listar(){
		
		Atividade a1 = new Atividade(1, "Visita tecnica do GDG");
		Atividade a2 = new Atividade(2, "Simpos");
		
		return Arrays.asList(a1, a2);
		
	}//fim[listar]
	*/

}//fim[AtividadeResource]
