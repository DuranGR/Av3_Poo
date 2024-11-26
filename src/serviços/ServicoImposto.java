package serviços;

import entidades.Produto;
import entidades.Acessorios;
import entidades.Console;
import entidades.Jogos;
import entidades.Loja;

public class ServicoImposto {
	private Imposto servicoImposto;

	public ServicoImposto(Imposto servicoImposto) {
		this.servicoImposto = servicoImposto;
	}

	public void processarImposto(Loja loja) {
		double imposto;
		imposto = servicoImposto.calculaImposto(); 
		loja.setImposto(imposto); // Muda o valor da variável imposto na loja
	}
}
