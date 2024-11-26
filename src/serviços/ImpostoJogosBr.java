package serviços;

import entidades.Loja;

public class ImpostoJogosBr implements Imposto{

	@Override
	public Double calculaImposto() {
		return 1.15;
	}

}
