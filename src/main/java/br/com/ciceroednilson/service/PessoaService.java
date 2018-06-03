package br.com.ciceroednilson.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciceroednilson.model.PessoaModel;
import br.com.ciceroednilson.model.ResponseModel;
import br.com.ciceroednilson.repository.PessoaRepository;
 
@CrossOrigin(origins  = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class PessoaService {
 
	@Autowired
	private PessoaRepository pessoaRepository; 
 
	/**
	 * SALVAR UM NOVO REGISTRO
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(name="/pessoa", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody PessoaModel pessoa){
 
 
		try {
 
			this.pessoaRepository.save(pessoa);
 
			return new ResponseModel();
 
		}catch(Exception e) {
 
			return new ResponseModel();			
		}
	}
 
	/**
	 * ATUALIZAR O REGISTRO DE UMA PESSOA
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(name="/pessoa", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody PessoaModel pessoa){
 
		try {
 
			this.pessoaRepository.save(pessoa);		
 
			return new ResponseModel();
 
		}catch(Exception e) {
 
			return new ResponseModel();
		}
	}
 
	/**
	 * CONSULTAR TODAS AS PESSOAS
	 * @return
	 */
	@RequestMapping(value="/name", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<PessoaModel> consultar(){
 
		return this.pessoaRepository.findAll();
	}
 
	/**
	 * BUSCAR UMA PESSOA PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
//	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public @ResponseBody PessoaModel buscar(@PathVariable("codigo") Long codigo){
// 
//		return this.pessoaRepository.findOne(codigo);
//	}
 
	/***
	 * EXCLUIR UM REGISTRO PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
//	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public @ResponseBody ResponseModel excluir(@PathVariable("codigo") Long codigo){
// 
//		PessoaModel pessoaModel = pessoaRepository.findOne(codigo);
// 
//		try {
// 
//			pessoaRepository.delete(pessoaModel);
// 
//			return new ResponseModel();
// 
//		}catch(Exception e) {
//			return new ResponseModel();
//		}
//	}
 
}