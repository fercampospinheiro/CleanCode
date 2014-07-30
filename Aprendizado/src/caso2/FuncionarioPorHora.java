package caso2;

import caso1.Dinheiro;
import caso1.SALARIO;

public class FuncionarioPorHora extends Funcionario {


	public FuncionarioPorHora(SALARIO s) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isDiaPagamento() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Dinheiro calculaPagamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean efetuaPagamento(Dinheiro dinheiro) {
		// TODO Auto-generated method stub
		return false;
	}

}
