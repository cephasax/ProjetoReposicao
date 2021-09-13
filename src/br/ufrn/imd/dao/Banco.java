package br.ufrn.imd.dao;

public class Banco implements IImobiliaria{

	@Override
	public boolean inserir(Imovel imovel) throws ExcecaoCapacidadeMaximaAtingida {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Imovel imovel) throws ExcecaoImovelNaoEncontrado {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alugar(Imovel imovel) throws ExcecaoImovelIndisponivel {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean devolver(Imovel imovel) throws ExcecaoImovelJaEstaDisponivel {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String listarImovel() throws ExcecaoImobiliariaVazia {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Imovel buscarImovel(int codigo) throws ExcecaoImovelNaoEncontrado {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getQuantidadeImoveis() {
		// TODO Auto-generated method stub
		return 0;
	}

}
