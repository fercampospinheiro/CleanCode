package caso2;

import caso1.SALARIO;
import caso1.tipoFuncionarioInvalido;

public class main2 {

	public static void main(String[] args) throws tipoFuncionarioInvalido {
		
		FuncionarioFactory fabrica = new FuncionarioFatoryImpl();
		Funcionario funcionario = fabrica.geraFuncionario(SALARIO.ASALARIADO);
	
		System.out.println(funcionario.calculaPagamento());
		
	}
}
