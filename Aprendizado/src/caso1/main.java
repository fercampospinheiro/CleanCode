package caso1;

public class main {
	
	public static void main(String[] args) {
		Funcionario antonio = new Funcionario();
		
		antonio.salario = SALARIO.ASALARIADO;
		
		FolhaDePagamento fpg = new FolhaDePagamento();
		
		try {
			fpg.calculaPagamento(antonio);
		} catch (tipoFuncionarioInvalido e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
