package caso2;

import caso1.SALARIO;
import caso1.tipoFuncionarioInvalido;

public class FuncionarioFatoryImpl implements FuncionarioFactory{

	@Override
	public Funcionario geraFuncionario(SALARIO s) throws tipoFuncionarioInvalido {
		switch (s) {
		case COMISSIONADO:
			return  new FuncionarioComissionado(s);
		case PORHORA:
			return new FuncionarioPorHora(s); 
		case ASALARIADO:
			return new FuncionarioAssalariado(s);	
		default: throw new tipoFuncionarioInvalido(s);
		}
	}
}
