package br.ufrn.imd.modelo;

public interface IImobiliaria {

	public boolean inserir(Imovel imovel) throws ExcecaoCapacidadeMaximaAtingida;

	public boolean remover(Imovel imovel) throws ExcecaoImovelNaoEncontrado;

	public boolean alugar(Imovel imovel) throws ExcecaoImovelIndisponivel;

	public boolean devolver(Imovel imovel) throws ExcecaoImovelJaEstaDisponivel;

	public String listarImovel() throws ExcecaoImobiliariaVazia;

	public Imovel buscarImovel(int codigo) throws ExcecaoImovelNaoEncontrado;

	public int getQuantidadeImoveis();
	
}
