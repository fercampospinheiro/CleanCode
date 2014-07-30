package caso2;

import caso1.Dinheiro;
import caso1.SALARIO;

public class FuncionarioComissionado extends Funcionario implements IFuncionario {

	public FuncionarioComissionado(SALARIO s) {
		
	}

	@Override
	public boolean isDiaPagamento() {
		System.out.println("Ok é dia de pagamento : Comissionado");
		return false;
	}

	@Override
	public Dinheiro calculaPagamento() {
		System.out.println("Calculando pagamento : Comisionado");
		return null;
	}

	@Override
	public boolean efetuaPagamento(Dinheiro dinheiro) {
		System.out.println("efetuando pagamento : Comissionado");
		return false;
	}

}
