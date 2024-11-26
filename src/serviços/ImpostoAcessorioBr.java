package serviços;

import entidades.Loja;

public class ImpostoAcessorioBr implements Imposto{

	@Override
	public Double calculaImposto() {
		return 1.19;
	}

}
