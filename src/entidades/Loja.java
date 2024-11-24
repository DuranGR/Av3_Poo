package entidades;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private String nome;
	private Double dinheiro;

	public Loja(ArrayList<Produto> produtos, String nome, Double dinheiro) {
		super();
		this.produtos = produtos;
		this.nome = nome;
		this.dinheiro = dinheiro;
	}
	/*
	 * Funções a se fazer
	 * 
	 * comprarItem//
	 * 
	 * venderItem//
	 * 
	 * Adicionar Dinheiro//
	 * 
	 *
	 *	
	 * 
	 * encontrarProdutoPorCodigo//
	 * 
	 * 
	 * 0 1 2 lista de int = lint = (1, 2, 3) lint.get(2) for(int aux:lint){
	 * 
	 * }
	 */

	public boolean comprarItem(Produto prod) {
		if (prod.getPreco() * prod.getQuantidade() > dinheiro) {
			return false;
		}
		produtos.add(prod);
		return true;
	}

	public int encontrarProduto(int codigo) {
		int counter = 0;
		for (Produto produto : produtos) {
			if (codigo == produto.getCodigo()) {
				return counter;
			}
			counter += 1;
		}
		return -1;
	}

	public boolean venderItem(int codigo, int quantidade) {
		int itemIndex = encontrarProduto(codigo);

		if (itemIndex != -1 && produtos.get(itemIndex).getQuantidade() >= quantidade) {

			Produto produtoVenda = produtos.get(itemIndex);

			dinheiro += quantidade * produtoVenda.getPreco();

			produtoVenda.setQuantidade(produtoVenda.getQuantidade() - quantidade);

			if (produtoVenda.getQuantidade() == 0) {
				produtos.remove(produtoVenda);
			}
			return true;
		}
		return false;
	}
	public String mostrarProdutos() {
		int counter = 1;
		String produtosAtuais = "----Lista De Produtos----\n\n\n";
		for(Produto produto: produtos){
			produtosAtuais+="#"+counter+" "+ produto.toString()+"\n\n";
			counter +=1;
			
		}
		return produtosAtuais;
	}

	public void addDinheiro(double valor) {
		dinheiro += valor;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(Double dinheiro) {
		this.dinheiro = dinheiro;
	}

}