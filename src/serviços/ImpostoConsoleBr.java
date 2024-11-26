package serviços;

import entidades.Loja;

public class ImpostoConsoleBr implements Imposto{

	@Override
	public Double calculaImposto() {
		return 1.25;
	}

}
