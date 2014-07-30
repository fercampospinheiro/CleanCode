package caso2;

import caso1.SALARIO;
import caso1.tipoFuncionarioInvalido;

public interface FuncionarioFactory {

	public Funcionario geraFuncionario(SALARIO s) throws tipoFuncionarioInvalido;
}
