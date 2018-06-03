package br.com.ciceroednilson.model;
 
public class ResponseModel {
 
	private Long codigo;
	private String mensagem;
 
	public ResponseModel() {}
 
	public ResponseModel(Long codigo, String mensagem) {
		this.codigo   = codigo;
		this.mensagem =  mensagem;
	}
 
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getMensagem() {
		return mensagem;
	}
 
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
 
}