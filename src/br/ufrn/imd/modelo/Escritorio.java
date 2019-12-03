package br.ufrn.imd.modelo;

import br.ufrn.imd.excecoes.ExcecaoDadoInvalido;

public class Escritorio extends Imovel{
	
	private float areaUtil;
	private int numSalas;
	
	public float getAreaUtil() {
		return areaUtil;
	}
	
	public void setAreaUtil(float areaUtil) throws ExcecaoDadoInvalido {
		if(areaUtil < 0){
			throw new ExcecaoDadoInvalido("nao é permitido usar numero negativo para este atributo");
		}
		else{
			this.areaUtil = areaUtil;
		}
	}
	
	
	public int getNumSalas() {
		return numSalas;
	}
	
	public void setNumSalas(int numSalas) throws ExcecaoDadoInvalido {
		if(numSalas < 0){
			throw new ExcecaoDadoInvalido("nao é permitido usar numero negativo para este atributo");
		}
		else{
			this.numSalas = numSalas;
		}
	}
}	


