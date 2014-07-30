package caso2;

import caso1.Dinheiro;
import caso1.SALARIO;

public class FuncionarioAssalariado extends Funcionario implements IFuncionario {


	public FuncionarioAssalariado(SALARIO s) {
		
	}

	@Override
	public boolean isDiaPagamento() {
		System.out.println("Ok é dia de pagamento : Assalariado");
		return false;
	}

	@Override
	public Dinheiro calculaPagamento() {
		System.out.println("Calculando pagamento : Assalariado");
		return null;
	}

	@Override
	public boolean efetuaPagamento(Dinheiro dinheiro) {
		System.out.println("efetuando pagamento : Assalariado");
		return false;
	}

}
