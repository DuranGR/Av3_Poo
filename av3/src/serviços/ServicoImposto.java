package serviços;


import entidades.Loja;

public class ServicoImposto {
	private Imposto servicoImposto;

	public ServicoImposto(Imposto servicoImposto) {
		this.servicoImposto = servicoImposto;
	}

	public void processarImposto(Loja loja) {
		double imposto;
		imposto = servicoImposto.calculaImposto(); 
		loja.setImposto(imposto); // Muda o valor da variáv
	}
}
