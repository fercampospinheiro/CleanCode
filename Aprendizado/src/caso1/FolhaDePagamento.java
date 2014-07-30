package caso1;

public class FolhaDePagamento {

	public Dinheiro calculaPagamento(Funcionario funcionario) throws tipoFuncionarioInvalido {
		 
		switch (funcionario.salario) {
		case COMISSIONADO:
			return calculaPagamentoDeComissao(funcionario);
		case PORHORA:
			return calculaPagamentoHora(funcionario);
		case ASALARIADO:
			return calculaPagamentoSalario(funcionario);	
		default: throw new tipoFuncionarioInvalido(funcionario);
		}
		
		
	}

	private Dinheiro calculaPagamentoSalario(Funcionario funcionario) {
		System.out.println("Recebe Salario");
		return null;
	}

	private Dinheiro calculaPagamentoHora(Funcionario funcionario) {
		System.out.println("Recebe Por Hora");
		return null;
	}

	private Dinheiro calculaPagamentoDeComissao(Funcionario funcionario) {
		System.out.println("Recebe Comissão");
		return null;
	}
	
	public Dinheiro isDiaPagamento(Funcionario funcionario) throws tipoFuncionarioInvalido {
		 
		switch (funcionario.salario) {
		case COMISSIONADO:
			return isDiaPagamentoDeComissao(funcionario);
		case PORHORA:
			return isDiaPagamentoHora(funcionario);
		case ASALARIADO:
			return isDiaPagamentoSalario(funcionario);	
		default: throw new tipoFuncionarioInvalido(funcionario);
		}
		
		
	}

	private Dinheiro isDiaPagamentoSalario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return null;
	}

	private Dinheiro isDiaPagamentoHora(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return null;
	}

	private Dinheiro isDiaPagamentoDeComissao(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
