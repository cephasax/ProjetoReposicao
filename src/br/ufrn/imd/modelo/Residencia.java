package br.ufrn.imd.modelo;

import br.ufrn.imd.excecoes.ExcecaoDadoInvalido;

public class Residencia extends Imovel{
	
	private int numQuartos;
	private int qntSuite;
	private boolean depemdemciaEmpregada;
	
	public int getNumQuartos() {
		return numQuartos;
	}
	
	public void setNumQuartos(int numQuartos) throws ExcecaoDadoInvalido {
		if(numQuartos < 0){
			throw new ExcecaoDadoInvalido("nao é permitido usar numero negativo para este atributo");
		}
		else{
			this.numQuartos = numQuartos;
		}
	}
	
	public int getQntSuite() {
		return qntSuite;
	}
	
	public void setQntSuite(int qntSuite) throws ExcecaoDadoInvalido{
		if(qntSuite < 0){
			throw new ExcecaoDadoInvalido("nao é permitido usar numero negativo para este atributo");
		}
		else{
			this.qntSuite = qntSuite;
		}
	}
	
	public boolean isDepemdemciaEmpregada() {
		return depemdemciaEmpregada;
	}
	
	public void setDepemdemciaEmpregada(boolean depemdemciaEmpregada) {
		this.depemdemciaEmpregada = depemdemciaEmpregada;
	}

}

