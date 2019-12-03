package br.ufrn.imd.modelo;

import br.ufrn.imd.excecoes.ExcecaoDadoInvalido;

public class Imovel {
	
	private int codigo;
	private String regiao;
	private float area;
	private boolean disponivel;
	private int qntVagaGaragem;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) throws ExcecaoDadoInvalido {
		if(codigo < 0){
			throw new ExcecaoDadoInvalido("nao é permitido usar numero negativo para este atributo");
		}
		else{
			this.codigo = codigo;
		}
	}
	
	public String getRegiao() {
		return regiao;
	}
	
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public float getArea(){
		return this.area;
	}
	public void setArea(float area) throws ExcecaoDadoInvalido{
		if(area < 0){
			throw new ExcecaoDadoInvalido("nao é permitido usar numero negativo para este atributo");
		}
		else{
			this.area = area;
		}
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public int getQntVagaGaragem() {
		return qntVagaGaragem;
	}
	
	public void setQntVagaGaragem(int qntVagaGaragem) throws ExcecaoDadoInvalido{
		if(qntVagaGaragem < 0){
			throw new ExcecaoDadoInvalido("nao é permitido usar numero negativo para este atributo");
		}
		else{
			this.qntVagaGaragem = qntVagaGaragem;
		}
	}
	
	
}
