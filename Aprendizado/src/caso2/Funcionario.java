package caso2;

import caso1.Dinheiro;

public abstract class Funcionario {
	
	public abstract boolean isDiaPagamento();
	public abstract Dinheiro calculaPagamento();
	public abstract boolean efetuaPagamento(Dinheiro dinheiro);
	
}

